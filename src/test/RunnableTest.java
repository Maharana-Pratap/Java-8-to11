package test;

class RunThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" - is calling...!");
	}
}
public class RunnableTest {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new RunThread());
		Thread t2 = new Thread(new RunThread());
		Thread t3 = new Thread(new RunThread());
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}
	
}
