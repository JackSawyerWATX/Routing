package com.jacksawyer.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class PracticeController {
	public static void main(String[] args) {
		SpringApplication.run(PracticeController.class, args);
	}
	
	@RequestMapping("/coding")
		public String coding() {
		return "Hello Luser!";
		}
	
	@RequestMapping("/coding/python")
		public String python() {
		return "Python is dope!";
		}
	
	@RequestMapping("/coding/java")
		public String java() {
		return "Java is more better!!!";
	}
	
}


