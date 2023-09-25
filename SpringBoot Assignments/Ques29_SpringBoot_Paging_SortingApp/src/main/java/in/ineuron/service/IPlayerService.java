package in.ineuron.service;


import org.springframework.data.domain.Page;

import in.ineuron.model.Player;

public interface IPlayerService {

	public Page<Player> getAllPlayer(int page,int size,String sortBy,String sortOrder);
}
