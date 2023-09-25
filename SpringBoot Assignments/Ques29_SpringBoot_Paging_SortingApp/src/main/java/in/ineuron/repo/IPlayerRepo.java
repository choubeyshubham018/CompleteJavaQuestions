package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.Player;

public interface IPlayerRepo extends JpaRepository<Player, Integer> {

}
