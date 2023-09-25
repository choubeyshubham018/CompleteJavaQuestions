package in.ineuron.servicefactory;

import in.ineuron.service.BlogServiceImpl;
import in.ineuron.service.IBlogService;

public class BlogServiceFactory {

	private static IBlogService service;
	
	public static IBlogService getBlogService() {
		if(service==null) {
			service=new BlogServiceImpl();
		}
		return service;
	}
}
