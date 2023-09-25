package in.ineuron;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		   Thread thread = new Thread(new QueueManipulation(q));
		   thread.start();
		   
		   Producer producer = new Producer(q);

	}

}
