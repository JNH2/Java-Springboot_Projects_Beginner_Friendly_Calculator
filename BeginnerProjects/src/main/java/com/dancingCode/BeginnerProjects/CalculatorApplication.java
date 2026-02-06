package com.dancingCode.BeginnerProjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class CalculatorApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
		Controller_UI ui = context.getBean(Controller_UI.class);
		System.out.println("Application internal test start.");
		ui.start();
		System.out.println("Application internal test end.");
	}
}