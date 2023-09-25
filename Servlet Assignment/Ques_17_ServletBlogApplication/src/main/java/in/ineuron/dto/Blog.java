package in.ineuron.dto;

import java.io.Serializable;

public class Blog implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private Integer bid;
	
	private String title;
	
	private String description;
	
	private String content;

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Blog [bid=" + bid + ", title=" + title + ", description=" + description + ", content=" + content + "]";
	}
	
	
}
