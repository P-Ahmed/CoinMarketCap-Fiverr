# Part One

## Technology:
- Tool: Selenium
- Language: Java
- IDE: Intellij IDEA
- Build tool: Maven
- Framework: Cucumber
- Syntax: Gherkin

## Prerequisite:
1. Need to install jdk 11 and configure it into Environment variable
2. Download maven and configure it into Environment variable also

## Run the automation script:
1. Open the project with Intellij IDEA by clicking on pom.xml
2. Let the Intellij IDEA to download the dependencies for the first run
3. After dependencies are downloaded and project loaded successfully, click on Terminal from the bottom bar
4. Type this command:
```sh
mvn clean install
```
5. Selenium will open the browser and start automation.
6. To view report of the automation execution, expand the target folder and open "cucumber-html-report.html" in a browser
```sh
```