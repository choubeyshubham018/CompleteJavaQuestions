package in.ineuron.model;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "USER_DETAIL")
@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;

	@Nonnull
	private String name;
	@Nonnull
	private String address;
	
	@OneToMany(targetEntity =Orders.class ,cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID" ,referencedColumnName = "uid" )
	private List<Orders> orders;
}
