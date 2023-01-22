# Automation on coinmarketcap.com
- Filtering Ul and extracting data for comparison

## Instructions to be followed when doing automation:
- Create a repository e.g. bitbucket, github, gitlab etc... and make it public
- Complete task using Java/JavaScript
- Repository must include well written read me file
- Code must have Cucumber/Gherkin integration
- API library choices are left to you
- use GIT strategies for delivering features within the framework

## Flows to be automated:
1. go to https://coinmarketcap.com
2. show rows by 20
3. capture all page contents - we will let you decide what is the correct information to capture, suggestions e.g. price, name,
position
4. filter by Algorithm - "POW"
5. followed by "+ Add Filter"
6. toggle "Mineable"
7. then select "All Cryptocurrencies"
8. select "Coins"
9. then select price and set minimum value to 100 and maximum to 10,000
10. compare page content to the content in step 3

## Technology used:
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
