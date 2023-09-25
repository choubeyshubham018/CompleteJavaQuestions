package in.ineuron.excep;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExcepDetails {

	private LocalDateTime time;
	private HttpStatus status;
	private String msg;
	
}
