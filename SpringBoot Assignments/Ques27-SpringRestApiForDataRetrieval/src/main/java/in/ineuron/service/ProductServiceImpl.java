package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Product;
import in.ineuron.repo.IProductRepo;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepo repo;
	
	@Override
	public Product getProductById(Integer pid) {
		Optional<Product> optional = repo.findById(pid);
		return optional.get();
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

}
