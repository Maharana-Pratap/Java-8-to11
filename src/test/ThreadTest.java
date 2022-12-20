package test;


class First extends Thread {
		public void run() {
		System.out.println(Thread.currentThread().getName()+ " - thread is calling...!");
	}
}

class Second extends Thread {
	
	public void run() {
		
	}
}

public class ThreadTest {
 public static void main(String[] args) {	 
	 Thread t1 = new First();
	 t1.start();
	 Thread t2 = new First();
	 t2.start();
}
}
