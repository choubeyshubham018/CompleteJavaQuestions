package in.ineuron.repo;

import java.util.List;

import in.ineuron.model.Players;

public interface IPlayersRepo {

	public String savePlayer(Players player);
	
	public Players findPlayerById(Integer id);
	
	public List<Players> findAllPlayers();
}
