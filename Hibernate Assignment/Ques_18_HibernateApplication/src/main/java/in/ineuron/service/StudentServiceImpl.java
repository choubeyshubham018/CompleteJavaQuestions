package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Student;
import in.ineuron.repo.IStudentDao;
import in.ineuron.util.HibernateUtil;

@Service
public class StudentServiceImpl implements IStudentService {
static {
	HibernateUtil
.loadOnStart();}
	
	@Autowired
	private IStudentDao dao;
	@Override
	public String addStudents(Student student) {
		return dao.saveStudents(student);
	}

	@Override
	public Student fetchStudent(Integer id) {
		return dao.fetchStudentById(id);
	}

	@Override
	public List<Student> fetchStudents() {
		return dao.fetchAllStudents();
	}

}
