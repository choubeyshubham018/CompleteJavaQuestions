package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.model.Student;
import in.ineuron.service.IStudentSevice;

@Component
public class StudentController {

	@Autowired
	private IStudentSevice service;
	
	public void saveStudent() {
		Student std1 = new Student("Sachin","MI");
		
		Student std = service.saveStudent(std1);
		System.out.println(std);
		System.out.println("The Student Record Inserted Succesfully with ID :: "+std.getSid());
	}
	
	public void saveStudentList() {
		Student std1 = new Student("Rohit","MI");
		Student std2 = new Student("Kohli","RCB");
		Student std3 = new Student("Dhoni","CSK");
		  List<Student> studentList = service.saveStudentList(List.of(std1,std2,std3));
		System.out.println(studentList);
		  System.out.println("All the Record Saved Succesfully");

	}
}
