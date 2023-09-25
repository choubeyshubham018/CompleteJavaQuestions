package in.ineuron;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}

	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		Runnable r = new MyThread();
		Thread thread = new Thread(r);
		
		thread.start();
		Thread.currentThread().sleep(1000);
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
	
	}

}
