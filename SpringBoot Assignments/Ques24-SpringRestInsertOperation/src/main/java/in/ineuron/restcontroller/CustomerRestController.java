package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Customer;
import in.ineuron.service.ICustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

	@Autowired
	private ICustomerService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> registerCustomer(@ModelAttribute Customer customer){
		String response = service.saveCustomer(customer);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}
