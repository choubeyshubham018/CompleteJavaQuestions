package in.ineuron.service;


import java.util.List;

import in.ineuron.model.Product;

public interface IProductService {

	public String saveProduct(Product product);
	
	public Product findProduct(Integer pid);
	
	public List<Product> getProductList();
	
	public String removeProduct(Integer pid);
	
	public String updateProduct(Product product);
	
}
