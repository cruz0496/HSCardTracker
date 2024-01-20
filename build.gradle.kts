import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    pmd
    jacoco
    java
    checkstyle

    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    id("org.asciidoctor.jvm.convert") version "3.3.2"
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"
	
    id("com.diffplug.spotless") version "6.24.0"
    id("com.github.spotbugs") version "6.0.6"
    id("com.github.ben-manes.versions") version "0.50.0"
    id("ca.cutterslade.analyze") version "1.9.1"
    id("com.adarshr.test-logger") version "4.0.0"
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
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.h2database:h2")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")

    // spotbugs("com.github.spotbugs:spotbugs:4.8.3")
    spotbugsPlugins("com.h3xstream.findsecbugs:findsecbugs-plugin:1.12.0")

    // Currently need to bring this in because Gradle does not have support for PMD7
    // and PMD 7 is  required for PMD support on Java17
    pmd("net.sourceforge.pmd:pmd-ant:7.0.0-rc4")
    pmd("net.sourceforge.pmd:pmd-java:7.0.0-rc4")
}

tasks.withType<KotlinCompile> {
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

tasks.named("asciidoctor") {
    dependsOn("test")
    inputs.dir(snippetsDir)
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

tasks.withType<Checkstyle> {
    reports.xml.required = true
    reports.html.required = true
}

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
tasks.jacocoTestReport {
    dependsOn(tasks.test)
}
tasks.withType<JavaCompile> {
    dependsOn(tasks.spotlessApply)
}
tasks.withType<KotlinCompile> {
    dependsOn(tasks.spotlessApply)
}
