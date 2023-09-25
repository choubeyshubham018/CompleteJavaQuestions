package in.ineuron;

import java.util.Queue;
import java.util.Random;

public class Producer {

	public Producer(Queue<Integer>q) {
		Thread.currentThread().setName("Producer");
		System.out.println("Producer class is executed by thread -- "+Thread.currentThread().getName());
		synchronized (q) {
			for(int i=0;i<10;i++) {
				q.add(new Random().nextInt(100));
			}
			System.out.println(q);
			
			q.notify();
		}
	}

}
