package in.ineuron.service;

import java.util.List;

import in.ineuron.dto.Blog;

public interface IBlogService {

	 public String saveBlog(Blog blog);
	 
	 public List<Blog> getBlog();
}
