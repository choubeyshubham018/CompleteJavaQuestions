package in.ineuron.model;

import java.io.Serializable;

public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Integer age;
	private String addr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
}
