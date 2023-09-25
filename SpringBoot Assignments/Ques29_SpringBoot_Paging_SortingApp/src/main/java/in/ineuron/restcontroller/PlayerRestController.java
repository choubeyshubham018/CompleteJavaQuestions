package in.ineuron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Player;
import in.ineuron.service.IPlayerService;

@RestController
@RequestMapping("/api")
public class PlayerRestController {

	@Autowired
	private IPlayerService service;
	
	@GetMapping("allPlayers")
	public ResponseEntity<Page<Player>> getAllPlayers(
			@RequestParam(defaultValue = "0")int page,
			@RequestParam(defaultValue = "4")int size,
			@RequestParam(defaultValue = "pid")String sortBy,
			@RequestParam(defaultValue = "asc")String sortOrder
			){
		 Page<Player> players = service.getAllPlayer(page, size, sortBy, sortOrder);
		return new ResponseEntity<Page<Player>>(players,HttpStatus.OK);
	}
}
