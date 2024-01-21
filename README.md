# main/Cruzstone



## Getting Started

Download links:

SSH clone URL: ssh://git@git.jetbrains.space/cruzstone/main/Cruzstone.git

HTTPS clone URL: https://git.jetbrains.space/cruzstone/main/Cruzstone.git



These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisites

### Plugins

While you are by no means required to use all the plugins I do I wanted to provide a list of the ones I used so you can have a feel for the kind of stuff I look for. Here are the plugins I use and a brief description of what they do:

#### Visual:
* Atom Material Icons - Adds icons to the editor.
* Extra ToolWindow Colorful Icons - Adds more icons for the tool windows.
* Material Theme UI - Powerful theming engine
* Indent Rainbow - Help keep track of indentation
* Rainbow Brackets - Helps keep track of brackets and scope
* Awesome Editor - allows you to set a background for your editor.

Linting:
* KtLint - Kotlin linting
* Palantir-java-format - Java linting

Code Analysis Integration:
* PMD - Integrate PMD into IntelliJ
* SonarLint - Integrate Sonar into IntelliJ

Formatting:
* Spotless Gradle - Allows you to reformat code with spotless from intelliJ so it matches what the gradle task would do.

Enhancements:
* GitToolBox - Additional git features.
* JPA Buddy - Helps manage JPA entities
* Key Promoter X - Tells you when you use a menu action that could have been a shortcut.
* Java Visualizer - Visualize java code during debugging

### Database Setup
In order to access the database in Intellij you will need to add a data source. You can do this by going into `View > Tool Windows > Database`. This will open the database tool likely docked to the right side.

Now you will want to click the `+` symbol and add a new **H2** datasource. In the top left it will say "type embedded", click that and change it to URL Only. Now copy the URL, username, and password from the `application.yml` file.

Note that the database build itself everytime the program is run. The database file is stored in `/db`and should be tracked to github. Note: Do not add the datasource until you have ran the program at least once. 

### Coding Style
Spotless is set up to format your code but if your code style is set contrary to it you can end up in a fight for your life. As such I have included a codestyle file in the project that matches up with the code style spotless is using. To get to your code style settings go to

`File > Settings > Editor > Codestyle > Java`

Click the treedot/hamburger menu and select `import schema > Intellij IDE code style XML`. Select the `intellij-java-palantir-style` file and click the `current schema` box to overwrite whatever your current settings are.

This should keep you mostly inline with spotless as your type.

## Deployment

Add additional notes about how to deploy this on a production system.

## Resources

Add links to external resources for this project, such as CI server, bug tracker, etc.
