package in.ineuron;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.config.AppConfig;
import in.ineuron.model.Players;
import in.ineuron.service.IPlayerService;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IPlayerService service = context.getBean(IPlayerService.class);
		// Saving player Records in DB
		System.out.println(service.savePlayer(new Players(10, "Sachin", "MI")));
		;
		System.out.println(service.savePlayer(new Players(18, "Kohli", "RCB")));
		;
		System.out.println(service.savePlayer(new Players(43, "Rohit", "MI")));
		System.out.println(service.savePlayer(new Players(7, "Dhoni", "CSK")));
		System.out.println(service.savePlayer(new Players(13, "Raina", "CSK")));

		System.out.println("**************************************************************");
     //Fetching Single Record By Id
		System.out.println(service.fetchPlayer(4));

		// Fetching All Records
		System.out.println("**************************************************************");
		List<Players> list = service.fetchAllPlayer();
		for (Players player : list) {
			System.out.println(player);
		}
	}
}
