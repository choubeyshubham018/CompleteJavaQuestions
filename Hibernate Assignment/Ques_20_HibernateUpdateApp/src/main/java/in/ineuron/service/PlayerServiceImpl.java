package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Players;
import in.ineuron.repo.IPlayerRepo;

@Service
public class PlayerServiceImpl  implements IServicePlayer
{
	@Autowired
	private IPlayerRepo repo;

	@Override
	public String updateRecord(Integer id,String name,String team) {
	
		return repo.updateRecord(id, name, team);
	}

	@Override
	public Players fetchPlayer(Integer id) {
		return repo.fetchPlayerById(id);
	}
   
}
