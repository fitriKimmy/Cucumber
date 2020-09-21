# Cucumber With Java
This project based on linked in course: [Cucumber Essential Training]( https://www.linkedin.com/learning/cucumber-essential-training/) 


## Tools instalation
- Maven
- JDK
- Eclipse IDE/intellij
- Install cucumber plugin
- [Selenium Java maven](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59)
- [Chromedriver](https://chromedriver.chromium.org/downloads)

### Run Test
Go to test folder executing this command
```
mvn test
```

run with specific tag
```
mvn test -Dcucumber.options=" -—tags '@RegularTest'"
```

Or you can also run runner file as Junit
