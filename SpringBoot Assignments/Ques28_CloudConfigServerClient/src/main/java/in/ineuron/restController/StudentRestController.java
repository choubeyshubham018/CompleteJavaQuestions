package in.ineuron.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Student;
import in.ineuron.service.IStudentService;

@RestController
@RequestMapping("/api")
@RefreshScope
public class StudentRestController {

	@Autowired
	private IStudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		return new ResponseEntity<String>(service.saveStudent(student),HttpStatus.OK);
	}
	
	@GetMapping("find/{sid}")
	public ResponseEntity<Student> fetchStudent(@PathVariable Integer sid) {
		return new ResponseEntity<Student>(service.getStudentById(sid),HttpStatus.FOUND);
	}
}
