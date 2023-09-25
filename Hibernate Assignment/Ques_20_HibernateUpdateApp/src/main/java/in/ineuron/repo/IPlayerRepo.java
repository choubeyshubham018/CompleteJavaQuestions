package in.ineuron.repo;

import in.ineuron.model.Players;

public interface IPlayerRepo {

	String updateRecord(Integer id,String name,String team);
	
	Players fetchPlayerById(Integer id);
}
