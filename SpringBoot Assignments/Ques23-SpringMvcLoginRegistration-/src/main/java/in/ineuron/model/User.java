package in.ineuron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "USER_DATA")
public class User {

	@Id()
	@Column(name = "USER_ID")
	private String userId;
	
	
	@NonNull
	@Column(name = "USER_PASS")
	private String password;
	
	@NonNull
	@Column(name = "USER_Name")
	private String name;
	
	@NonNull
	@Column(name = "USER_AGE")
	private Integer age;
	
	@NonNull
	@Column(name = "USER_EMAIL")
	private String email;
}
