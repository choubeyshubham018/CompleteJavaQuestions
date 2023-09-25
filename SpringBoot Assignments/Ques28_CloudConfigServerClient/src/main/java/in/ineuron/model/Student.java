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

@Entity
@Table(name = "STUDENT_DETAILS")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="STUDENT_SID")
	private Integer sid;
	
	@NonNull
	@Column(name="STUDENT_NAME")
	private String sname;
	@NonNull
	@Column(name="STUDENT_AGE")
	private Integer sage;
	@NonNull
	@Column(name="STUDENT_ADDRESS")
	private String address;

}
