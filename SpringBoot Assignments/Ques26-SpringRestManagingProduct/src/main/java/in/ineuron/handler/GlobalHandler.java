package in.ineuron.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.error.ProductNotFoundException;
import in.ineuron.excep.ExcepDetails;

@RestControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ExcepDetails> ProductNotFoundException(){
		ExcepDetails excepDetails = new ExcepDetails(LocalDateTime.now(), HttpStatus.NOT_FOUND, "Product Not Found");
		return new ResponseEntity<ExcepDetails>(excepDetails,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExcepDetails> handleAllException(){
		ExcepDetails excepDetails = new ExcepDetails(LocalDateTime.now(), HttpStatus.BAD_REQUEST, "Some Exception Occured");
		return new ResponseEntity<ExcepDetails>(excepDetails,HttpStatus.BAD_REQUEST);
	}
}
