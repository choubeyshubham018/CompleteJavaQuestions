package in.ineuron;

import java.util.Queue;

public class QueueManipulation implements Runnable {

	Queue<Integer> q;
	
	public QueueManipulation(Queue<Integer>q) {
	this.q=q;
	}
	@Override
	public void run() {
		Consumer consumer = new Consumer(q);
		
	}

}
