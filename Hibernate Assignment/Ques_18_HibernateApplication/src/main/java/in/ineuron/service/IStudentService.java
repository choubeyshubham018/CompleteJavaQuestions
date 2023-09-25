package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Student;

public interface IStudentService {

	public String addStudents(Student student);
	
	public Student fetchStudent(Integer id);
	
	public List<Student> fetchStudents();
}
