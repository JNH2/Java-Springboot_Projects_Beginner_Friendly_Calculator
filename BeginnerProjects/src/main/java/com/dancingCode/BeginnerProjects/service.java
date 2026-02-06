package com.dancingCode.BeginnerProjects;

import org.springframework.stereotype.Service;

@Service 
public class service {
    public String calculate(int choice, int n1, int n2) {
        if(choice == 1) {
            return String.valueOf(n1 + n2);
        } else if(choice == 2) {
            return String.valueOf(n1 - n2);
        } else {
            return "Invalid input. Please enter 1 for addition, 2 for subtraction, or 3 to exit.";
        }
    }
}