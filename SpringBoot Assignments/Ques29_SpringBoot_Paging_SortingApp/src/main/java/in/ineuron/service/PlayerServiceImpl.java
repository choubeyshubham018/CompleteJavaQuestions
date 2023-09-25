package in.ineuron.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ineuron.model.Player;
import in.ineuron.repo.IPlayerRepo;
@Service
public class PlayerServiceImpl implements IPlayerService {

	@Autowired
	private IPlayerRepo repo;
	@Override
	public Page<Player> getAllPlayer(int page, int size, String sortBy, String sortOrder) {
		Sort sort=Sort.by(Sort.Direction.fromString(sortOrder), sortBy);
		Pageable pageable=PageRequest.of(page, size, sort);
		return  repo.findAll(pageable) ;
	}

}
