# selenium-java
- - -
### Description :
Project description  is the same as the Python implementation.
- - -
### Executing Tests :
- Run all tests : 
```text
mvn clean test
```
- Run certain test : ` mvn -Dtest=ClassNameTest(*) test`
  
  For instance :
```text
mvn -Dtest=LanguageTest test
```
- Generate report :
```text
allure serve allure-results
```
- - -
`(*)` — class name tests you can find in the **testng.xml** file.
- - -