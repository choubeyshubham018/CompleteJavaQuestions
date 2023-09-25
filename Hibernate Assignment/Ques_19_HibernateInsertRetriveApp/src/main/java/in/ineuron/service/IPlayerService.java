package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Players;

public interface IPlayerService {
	
	public String savePlayer(Players player);
	
	public Players fetchPlayer(Integer id);
	
	public List<Players> fetchAllPlayer();

}
