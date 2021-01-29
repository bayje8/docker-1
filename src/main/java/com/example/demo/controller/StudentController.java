package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping(method=RequestMethod.GET, path="/student")
	public Student getStudent() {
		return new Student("Balachandrasekar", "K5ECE06", "Diploma 1st Year");
	}
	
	public class Student {
		private java.lang.String name;
		private String rollnumber;
		private String standard;
		
		public Student(String name, String rollnumber, String standard) {
			this.name = name;
			this.rollnumber = rollnumber;
			this.standard = standard;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRollnumber() {
			return rollnumber;
		}
		public void setRollnumber(String rollnumber) {
			this.rollnumber = rollnumber;
		}
		public String getStandard() {
			return standard;
		}
		public void setStandard(String standard) {
			this.standard = standard;
		}
	}
}
