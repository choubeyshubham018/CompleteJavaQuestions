package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Student;
import in.ineuron.repo.IStudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepo repo;
	@Override
	public String saveStudent(Student student) {
		Integer sid = repo.save(student).getSid();
		return "Student Record is Saved with ID :: "+sid ;
	}

	@Override
	public Student getStudentById(Integer id) {
		return repo.findById(id).get();
	}

}
