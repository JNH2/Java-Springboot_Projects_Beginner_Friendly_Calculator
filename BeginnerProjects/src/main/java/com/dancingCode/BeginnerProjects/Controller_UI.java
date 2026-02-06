package com.dancingCode.BeginnerProjects;
// import java.util.Scanner;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller_UI {
    //private Scanner scanner = new Scanner(System.in);   
    @Autowired 
    private service service;
    @GetMapping("")
    public String WebCalculator(
        @RequestParam(required = false, defaultValue = "0") int choice, 
        @RequestParam(required = false, defaultValue = "0") int number1, 
        @RequestParam(required = false, defaultValue = "0") int number2) {
            if(choice == 0) {
                return "Welcome to the Calculator Application! This application allows you to perform basic arithmetic operations. Please enter 1 for addition, 2 for subtraction, 3 for exit.";
            }
            if(choice == 3) {
                return "Exiting the application. Goodbye!";
            }
        
            
        return "Result is: " + service.calculate(choice, number1, number2);
        }

    /*public void start() {
        System.out.println("Welcome to the Calculator Application!" +
                           " This application allows you to perform basic arithmetic operations." +
                           " Please enter 1 for addition, 2 for subtraction, 3 for exit.");
        while(true) {
            System.out.print("Choose operation: ");
            int choice = scanner.nextInt();
            if(choice == 3) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            }
            System.out.print("Enter first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int number2 = scanner.nextInt();
            String result = service.calculate(choice, number1, number2);
            System.out.println("Result: " + result);
        }
    } */
}
        