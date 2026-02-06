# Java-Projects-for-beginner-friendly-
1. Project Overview and User Requirements. This project originated from a basic user requirement to develop a reliable calculator capable of performing fundamental arithmetic operations (addition and subtraction). To ensure the application remains scalable for future business growth, I adopted an enterprise grade architecture from the very first day instead of writing a simple script.

2. Architectural Design. This project follows a three tier architecture to achieve high cohesion and low coupling. The presentation tier (Controller_UI) handles user input via Scanner and manages terminal output. The logic tier (Service) encapsulates the core arithmetic algorithms. The data tier (Model) defines the data entities (result mapping).

3. Technology Stack and Modernization. The project utilizes Java 17 and the Spring Boot framework, introducing Inversion of Control (IoC) and Dependency Injection (DI). I utilized annotations (such as @Service, @Component, and @Autowired) to manage component lifecycles, replacing manual object instantiation and thereby enhancing code testability.

4. Development Challenges and Solutions. One challenge was transitioning from procedural programming to dependency injection. I refactored the code to let the Spring container manage the Service instance, ensuring the controller focused only on interaction logic. Another challenge involved terminal blocking within a Spring context. I resolved this by configuring spring.main.web-application-type to none in the application.yaml file, which optimized startup speed and avoided unnecessary port binding during logic testing.

5. There is a branch named web-port-vertion using port to test the calculator.

6. For the develop with frondend could furthur create a new branch under current branch web-port-vertion(not main) adding a new under resource: index.html (others dont need modify)
    <!DOCTYPE html>
<html>
<body>
    <form action="/" method="get">
        <input name="choice" placeholder="1:+ 2:- 3:exit"><br>
        <input name="number1" placeholder="number1"><br>
        <input name="number2" placeholder="number2"><br>
        <button type="submit">OK</button>
    </form>
</body>
</html>
