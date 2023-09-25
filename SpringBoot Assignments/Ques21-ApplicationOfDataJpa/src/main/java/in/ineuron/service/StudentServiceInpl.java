package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Student;
import in.ineuron.repository.IStudentRepo;

@Service
public class StudentServiceInpl implements IStudentSevice {

	@Autowired
	private IStudentRepo repo;
	
	@Override
	public Student saveStudent(Student std) {
		 Student student = repo.save(std);
		return student;
	}

	@Override
	public List<Student> saveStudentList(List<Student> students) {
		 List<Student> stdList = repo.saveAll(students);
		return stdList;
	}

}
