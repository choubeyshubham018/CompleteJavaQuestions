package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
