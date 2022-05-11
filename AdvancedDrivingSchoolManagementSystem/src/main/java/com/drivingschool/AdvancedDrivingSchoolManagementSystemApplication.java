package com.drivingschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.drivingschool")
public class AdvancedDrivingSchoolManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedDrivingSchoolManagementSystemApplication.class, args);
		System.out.println("Application is running...");
	}

}
