package in.ineuron.daofactory;

import in.ineuron.dao.IProductDao;
import in.ineuron.dao.ProductDaoImpl;

public class ProductDaoFactory {

	private static IProductDao dao;
	
	public static IProductDao getProductimpl() {
		if(dao==null) {
			dao=new ProductDaoImpl();
		}
		return dao;
	}
}
