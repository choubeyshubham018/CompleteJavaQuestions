package in.ineuron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.ineuron.model.Product;
import in.ineuron.service.IProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	private IProductService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		System.out.println(product);
	String response = service.saveProduct(product);
	return new ResponseEntity<String>(response,HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{pid}")
	public ResponseEntity<Product> findProductById(@PathVariable Integer pid){
		Product product = service.findProduct(pid);
		return new ResponseEntity<Product>(product,HttpStatus.FOUND);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Product>> getProducts(){
		List<Product> products = service.getProductList();
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){
		String response = service.updateProduct(product);
		return new ResponseEntity<String>(response,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer pid){
		String response = service.removeProduct(pid);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}
