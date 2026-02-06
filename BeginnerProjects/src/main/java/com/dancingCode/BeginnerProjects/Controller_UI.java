package com.dancingCode.BeginnerProjects;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Controller_UI {
    private Scanner scanner = new Scanner(System.in);   
    @Autowired 
    private service service;

    public void start() {
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
    }
}
        