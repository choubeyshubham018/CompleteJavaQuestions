package in.ineuron.service;

import in.ineuron.dao.IProductDao;
import in.ineuron.daofactory.ProductDaoFactory;
import in.ineuron.model.Product;

public class ProductServiceImpl implements IProductService {

	private IProductDao dao;

	public ProductServiceImpl() {
		dao = ProductDaoFactory.getProductimpl();
	}

	@Override
	public Product getProduct(Integer pid) {
		return dao.getProduct(pid);
	}

}
