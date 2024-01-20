# main/Cruzstone



## Getting Started

Download links:

SSH clone URL: ssh://git@git.jetbrains.space/cruzstone/main/Cruzstone.git

HTTPS clone URL: https://git.jetbrains.space/cruzstone/main/Cruzstone.git



These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisites

### Database Setup
In order to access the database in Intellij you will need to add a data source. You can do this by going into `View > Tool Windows > Database`. This will open the database tool likely docked to the right side.

From here click the `+` symbol in the top left and select "Import data source...". This should build a datasource for your using the properties in `application.yml`.

Note that the database build itself everytime the program is run. The database file is stored in `src/main/resources/db`and should be tracked to github.

### Coding Style
Spotless is set up to format your code but if your code style is set contrary to it you can end up in a fight for your life. As such I have included a codestyle file in the project that matches up with the code style spotless is using. To get to your code style settings go to

`File > Settings > Editor > Codestyle > Java`

Click the treedot/hamburger menu and select `import schema > Intellij IDE code style XML`. Select the `intellij-java-palantir-style` file and click the `current schema` box to overwrite whatever your current settings are.

This should keep you mostly inline with spotless as your type.

## Deployment

Add additional notes about how to deploy this on a production system.

## Resources

Add links to external resources for this project, such as CI server, bug tracker, etc.
