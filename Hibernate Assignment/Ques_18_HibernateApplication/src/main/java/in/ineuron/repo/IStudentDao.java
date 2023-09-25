package in.ineuron.repo;

import java.util.List;

import in.ineuron.model.Student;

public interface IStudentDao {

	public String saveStudents(Student student);
	
	public Student fetchStudentById(Integer id);
	
	public List<Student> fetchAllStudents();
}
