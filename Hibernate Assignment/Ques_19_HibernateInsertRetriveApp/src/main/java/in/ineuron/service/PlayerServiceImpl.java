package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Players;
import in.ineuron.repo.IPlayersRepo;

@Service
public class PlayerServiceImpl implements IPlayerService {

	@Autowired
	private IPlayersRepo repo;
	@Override
	public String savePlayer(Players player) {
		return repo.savePlayer(player);
	}


	@Override
	public Players fetchPlayer(Integer id) {
		return repo.findPlayerById(id);
	}

	@Override
	public List<Players> fetchAllPlayer() {
		return repo.findAllPlayers();
	}

}
