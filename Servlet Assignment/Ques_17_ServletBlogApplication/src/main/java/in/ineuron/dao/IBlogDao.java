package in.ineuron.dao;

import java.util.List;

import in.ineuron.dto.Blog;

public interface IBlogDao {

	public String saveBlog(Blog blog);
	
	
	public List<Blog> getBlog();
}
