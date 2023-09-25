package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Product;

public interface IProductService {

	Product getProductById(Integer pid);
	List<Product> getAllProducts();
}
