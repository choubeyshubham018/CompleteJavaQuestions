package in.ineuron;

import java.util.Queue;

public class Consumer {

	public Consumer(Queue<Integer>q)  {
      Thread.currentThread().setName("Consumer");
      System.out.println("Consumer class is executed by thread --  "+Thread.currentThread().getName());
      int sum=0;
      synchronized (q) {
    	  if(q.isEmpty()) {
    		  try {
				q.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	  }else {
		for (Integer value : q) {
			sum+=value;
		}
		System.out.println("The total sum is --> "+sum);
	}
      }
	}

}
