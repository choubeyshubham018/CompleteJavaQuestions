package in.ineuron.servicefactory;

import in.ineuron.service.IProductService;
import in.ineuron.service.ProductServiceImpl;

public class ProductServiceFactory {

	private static IProductService service;
	
	public static IProductService getProductService() {
		if(service==null) {
			service=new ProductServiceImpl();
		}
		return service;
	}
}
