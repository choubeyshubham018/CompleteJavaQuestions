package in.ineuron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/api")
public class CircuitBreakerController {

	@GetMapping("find/{id}")
	@HystrixCommand(fallbackMethod = "findFallback")
	public ResponseEntity<String> findById(@PathVariable Integer id){
		if(id>10) {
			throw new RuntimeException("Dummy Error");
		}
		String res="Record Found for id :: "+id;
		return new ResponseEntity<String>(res,HttpStatus.FOUND);
	}
	public ResponseEntity<String> findFallback(Integer id){
		String res="Some Error occurs Try Again After SomeTime";
		return new ResponseEntity<String>(res,HttpStatus.BAD_GATEWAY);
	}
	
	
}
