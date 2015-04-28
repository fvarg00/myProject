package org.finsen.test.random.code;
public class HelloThread implements Runnable {

	public synchronized void run() {
		//synchronized (this) {

			try {
				// doing some lengthy operation
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello from a thread!:"
					+ Thread.currentThread().getName());
		}

	//}

	public static void main(String args[]) {
		// = null;
	//	for (int i = 0; i < 10; i++) {

			Thread t = new Thread(new HelloThread(), "ThreadName:" + 0);
			t.start();
			
			Thread t1 = new Thread(new HelloThread(), "ThreadName:" + 1);
			t1.start();
			
			Thread t2 = new Thread(new HelloThread(), "ThreadName:" + 2);
			t2.start();
			
			Thread t3 = new Thread(new HelloThread(), "ThreadName:" + 2);
			t.start();

		//}
	}

}