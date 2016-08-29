# testWS
This project is based on spring RESTful services, maven and spring boot. 
It recieves a list of zip codes and finds the largest zip code out of it.
Exception handling is at minimal and the exception message is displayed along with a 505 error page.
/error mapping is not implemented.

To just run the app, download the jar file 
https://github.com/vij658/testWS/blob/master/target/zip-code-rest-0.1.0.jar

command to run : java -jar zip-code-rest-0.1.0.jar

Sample input run from browser - http://localhost:8080/Get?zipCodeList=75024,81223,99999

Sample Output : {"zipCodeList":[75024,81223,99999],"finalOutput":"The maximum of the zip code list :99999"}

To compile the application using maven from the root folder

Command to compile: mvn clean install

Sample input - http://localhost:8080/Get?zipCodeList=75024,81223,99999

References:
Spring boot : http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html
