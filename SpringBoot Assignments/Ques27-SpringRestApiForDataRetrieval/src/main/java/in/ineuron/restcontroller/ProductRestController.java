package in.ineuron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Product;
import in.ineuron.service.IProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	private IProductService service;
	@GetMapping("/find/{pid}")
	public ResponseEntity<Product> fetchProduct(@PathVariable Integer pid){
		Product product = service.getProductById(pid);
		return new ResponseEntity<Product>(product,HttpStatus.FOUND);
		
	}
	@GetMapping("/findAll")
	public ResponseEntity<List<Product>> fetchAllProduct(){
		return new ResponseEntity<List<Product>>(service.getAllProducts(),HttpStatus.OK);
	}
}
