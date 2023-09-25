package in.ineuron.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PLAYER_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

	@Id
	private Integer pid;
	
	private String pname;
	
	private String address;
}
