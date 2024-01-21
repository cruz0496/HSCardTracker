plugins {
    pmd
    jacoco
    java

    alias(libs.plugins.org.springframework.boot)
    alias(libs.plugins.io.spring.dependency.management)
    alias(libs.plugins.org.asciidoctor.jvm.convert)
    alias(libs.plugins.org.jetbrains.kotlin.jvm)
    alias(libs.plugins.org.jetbrains.kotlin.plugin.spring)
    alias(libs.plugins.org.jetbrains.kotlin.plugin.jpa)

    alias(libs.plugins.com.diffplug.spotless)
    alias(libs.plugins.com.github.spotbugs)
    alias(libs.plugins.com.github.ben.manes.versions)
    alias(libs.plugins.nl.littlerobots.version.catalog.update)
    alias(libs.plugins.com.adarshr.test.logger)
}

group = "com.hs"
version = "0.0.1-SNAPSHOT"

java {
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

val snippetsDir by extra { file("build/generated-snippets") }

dependencies {
    implementation(libs.org.springframework.boot.spring.boot.starter.cache)
    implementation(libs.org.springframework.boot.spring.boot.starter.data.jpa)
    implementation(libs.org.springframework.boot.spring.boot.starter.validation)
    implementation(libs.org.springframework.boot.spring.boot.starter.web)
    implementation(libs.com.fasterxml.jackson.module.jackson.module.kotlin)
    implementation(libs.org.jetbrains.kotlin.kotlin.reflect)
    compileOnly(libs.org.projectlombok.lombok)
    developmentOnly(libs.org.springframework.boot.spring.boot.devtools)
    runtimeOnly(libs.com.h2database.h2)
    annotationProcessor(libs.org.projectlombok.lombok)
    testImplementation(libs.org.springframework.boot.spring.boot.starter.test)
    testImplementation(libs.org.springframework.restdocs.spring.restdocs.mockmvc)

    spotbugsPlugins(libs.com.h3xstream.findsecbugs.findsecbugs.plugin)

    // Currently need to bring this in because Gradle does not have support for PMD7
    // and PMD 7 is  required for PMD support on Java17
    pmd(libs.net.sourceforge.pmd.pmd.ant)
    pmd(libs.net.sourceforge.pmd.pmd.java)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "21"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.test {
    outputs.dir(snippetsDir)
}

tasks.withType<org.asciidoctor.gradle.jvm.AsciidoctorTask> {
    dependsOn("test")
    inputs.dir(snippetsDir)
}

tasks.jacocoTestReport {
    reports.xml.required = true
    reports.html.required = true
}
tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = "0.85".toBigDecimal()
                isFailOnViolation = false
            }
        }
    }
}

kotlin {
    jvmToolchain(21)
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    java {
        // Forces type annotations on the same line as the variable
        formatAnnotations()

        importOrder("java|javax", "org.springframework", "", "\\#")
        removeUnusedImports()

        cleanthat()
            .sourceCompatibility("21")
            .addMutator("ErrorProne")
            .addMutator("SafeAndConsensual")
            .includeDraft(false)

        // This is an updated version of Google's java rules that has better handling of lambdas.
        // IntelliJ plugin available here: https://plugins.jetbrains.com/plugin/13180-palantir-java-format
        palantirJavaFormat()
        licenseHeaderFile("header-template")
    }
	
    kotlin {
        ktlint()
        licenseHeaderFile("header-template")
    }
    kotlinGradle {
        ktlint()
    }
}

pmd {
    toolVersion = "7.0.0-rc4"
}

configure<com.github.spotbugs.snom.SpotBugsExtension> {
    toolVersion = "4.8.3"
    ignoreFailures = true
    showProgress = true
    effort = com.github.spotbugs.snom.Effort.MAX
    reportLevel = com.github.spotbugs.snom.Confidence.LOW
}
tasks.withType<com.github.spotbugs.snom.SpotBugsTask> {
    reports.create("html").required = true
    reports.create("xml").required = true
}

// Tells dependency plugin to reject upgrade options if they aren't full releases.
tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version) and !isNonStable(currentVersion)
    }
}

configure<com.adarshr.gradle.testlogger.TestLoggerExtension> {
    theme = com.adarshr.gradle.testlogger.theme.ThemeType.MOCHA
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}

// / Tests aren't considered done until jacocoTestReport runs
tasks.test {
    finalizedBy(tasks.jacocoTestReport)
}
// / If you trigger jacocoTestReport manually, it will run the tests first
tasks.jacocoTestReport { dependsOn(tasks.test) }
tasks.withType<JavaCompile> { dependsOn(tasks.spotlessApply) }
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { dependsOn(tasks.spotlessApply) }
tasks.withType<org.springframework.boot.gradle.tasks.run.BootRun> { dependsOn(tasks.spotlessApply) }
