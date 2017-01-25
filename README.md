# Web Testing Framework
This framework is a combination of maven, cucumber and selenium.

# Pre-requisites :
- Java home should be set in the machine.
- Maven home should be set in the machine.

# Setting up project in local - 
- If using git command line then use the below line on terminal.
```
git clone https://github.com/sourabhmunje/CucumberSelenium.git
```

- Else project can be downloaded using download link on github web page

```
https://github.com/sourabhmunje/CucumberSelenium
```

# Writing test cases 
This is a cucumber based project, so test cases can be written in feature files which are at folder location /src/test/resource/Tests1.feature

- The name of the scenario can be given using _Scenario Outline:_
- Any additional test cases can be written using annotations Given, When, And, Then
- The data to be provided should be given using _Examples:_
- The test cases can be increased for the same Scenario by adding more rows to the _Examples:_
- The browser to be used for execution is denoted by _browserType_
- The browsers supported are Firefox, Chrome and Edge.
- The keyword to be used for browsers are: firefox- _ff_, Chrome- _chrome_, Edge- _edge_
- If browser not specified, then firefox will be default browser.
- The test cases to be excuted needs to be specified with tags for example- _@test1_
- This tag needs to be specified in the RunnerTest.java
```
@Cucumber.Options(format = { "pretty", "json:target/json/output.json","html:target/html/" },
				features = { "./src/test/resource" },
				tags = { "@test1" })
```

# Executing test cases

- Go to the folder where project is present.
- Use maven commands to clean the project
```
mvn clean
```
- Compile the project
```
mvn compile
```
- Run the test cases
```
mvn test
```

# Reporting 
- The html report will be present in the target\html folder.



