package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Student;

public interface IStudentSevice {
	
	public Student saveStudent(Student std);
	
	public List<Student> saveStudentList(List<Student> students);
}
