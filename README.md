# Anish URL Hit Counter
######  Problem Statement
*  Build a simple URL Hit Counter feature using Spring Boot.

## Solution Overview
#### The project consists of three main components:

#### UrlHitController: Handles incoming HTTP requests and calls the service layer.
#### UrlHitService: Contains the business logic to handle hit counts.
#### UserHitCount: A model class to represent the hit count for a specific user.

## Step-by-Step Guide
### Step 1: Create a Spring Boot Project
* Visit the Spring Initializer.
* Fill in the project details:
* Group: com.example
* Artifact: `url-Counter-hit`
* Name: `Url-Counter-hit`
* Description: Simple URL Hit Counter
* Package name: com.example.urlhitcounter
* Dependencies: Spring Web
* Click "Generate" to download the project zip file.
* Unzip the downloaded file and open the project in your preferred IDE.

## Step 2: Create UrlHitController
* Create a UrlHitController.java file under the controller package:

##### java

* `@RestController`
* `@RequestMapping("api/v1/visitor-count-app")`
* `public class UrlHitController {`
* `@Autowired`
* `private UrlHitService urlHitService;`
* `@GetMapping("count")`
* `public void getHitCount() {`
* `/////..... Implement logic to get hit count`
*  `}`
* `}`

## Step 3: Create UrlHitService
* Create a UrlHitService.java file under the service package:

* java
* Copy code
* `@Service`
* `public class UrlHitService` 
* `{`
* `// TODO: Implement logic to handle hit counts`
* `}`
## Step 4: Implement Logic in UrlHitService
* Add the logic to handle hit counts in UrlHitService.java:

#### java
####    Copy code
*     `@Service`
*     `public class UrlHitService {`
*      `private int visitorCount = 0;`
*       `public int getVisitorCount() {`
*         `return ++visitorCount;`
*  `}`
*      public int getUserVisitorCount(String username) {
*        // TODO: Implement logic to track user-specific hits
*     }
*     }

## Step 5: Test Your Application
* Run your Spring Boot application.
* Open a web browser or use a tool like Postman to make a GET request to `http://localhost:8080/api/v1/visitor-count-app/count` You should receive the visitor count in the response.

## Additional Task
* Extend UrlHitController.java to include the additional task:
* java
* Copy code
*     @GetMapping("username/{username}/count")
*      public UserHitCount getUserHitCount(@PathVariable String username) {
*      int hitCount = urlHitService.getUserVisitorCount(username);
*      return new UserHitCount(username, hitCount);
*      }
### Create UserHitCount.java under the model package:
* java
* Copy code
*     public class UserHitCount {
*     private String username;
*     private int hitCount;

*     // Constructors, getters, and setters
*       }
### Implement user-specific hit count logic in UrlHitService.java.
## Step 6: Push to Git
* Initialize a Git repository in your project and push the code to your preferred Git hosting service.

You have now successfully created a Spring Boot project with a simple URL hit counter feature. The application tracks hits and supports an additional task for user-specific hit counts.

### Reference Documentation
For further reference, please consider the following sections:

* [GitHub Link](https://github.com/Anish1430/url-Counter-hit)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

