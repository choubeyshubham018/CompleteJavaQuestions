package in.ineuron.service;

import in.ineuron.model.Student;

public interface IStudentService {

	public String saveStudent(Student student);
	
	public Student getStudentById(Integer id);
}
