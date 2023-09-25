package in.ineuron.model;

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
@Table(name = "PLAYER_RECORD")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Players {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pno;
	
	@NonNull
	private Integer jersyNo;
	@NonNull
	private String name;
	@NonNull
	private String team;
}
