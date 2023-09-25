package in.ineuron.service;

import in.ineuron.model.Players;

public interface IServicePlayer {

	public String updateRecord(Integer id,String name,String team);
	
	public Players fetchPlayer(Integer id);
}
