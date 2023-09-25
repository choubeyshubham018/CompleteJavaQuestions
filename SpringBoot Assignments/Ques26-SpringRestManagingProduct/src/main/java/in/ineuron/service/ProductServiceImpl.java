package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.error.ProductNotFoundException;
import in.ineuron.model.Product;
import in.ineuron.repo.IProductRepo;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepo repo;
	
	@Override
	public String saveProduct(Product product) {
		Integer pid = repo.save(product).getPid();
		return "Product is Succesfully Added with ID :: "+pid;
	}

	@Override
	public Product findProduct(Integer pid) {
		Optional<Product> optional = repo.findById(pid);
		if(optional.isEmpty()) {
			throw new ProductNotFoundException("Record Not Found");
		}
		return optional.get();
	}

	@Override
	public List<Product> getProductList() {
		return repo.findAll();
	}

	@Override
	public String removeProduct(Integer pid) {
	  Optional<Product> optional = repo.findById(pid);
	  if(optional.isEmpty()) {
		  throw new ProductNotFoundException("Record not Found");
	  }
	  repo.deleteById(pid);
	  return "Record Deleted For ID :: "+pid;
	}

	@Override
	public String updateProduct(Product product) {
		repo.save(product);
		return "Record Updated Succesfully";
	}

}
