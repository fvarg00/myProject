package org.finsen.test;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadTest {

	public static void main(String args[]) {
		// = null;
	//	for (int i = 0; i < 10; i++) {
		
		ExecutorService exec = Executors.newFixedThreadPool(3);
		exec.execute(new HelloThread());
		exec.execute(new HelloThread());
		exec.execute(new HelloThread());
		exec.execute(new HelloThread());
		exec.shutdown();
		
		

//			Thread t = new Thread(new HelloThread(), "ThreadName:" + 0);
//			t.start();
//			
//			Thread t1 = new Thread(new HelloThread(), "ThreadName:" + 1);
//			t1.start();
//			
//			Thread t2 = new Thread(new HelloThread(), "ThreadName:" + 2);
//			t2.start();
//			
//			Thread t3 = new Thread(new HelloThread(), "ThreadName:" + 3);
//			t3.start();

		//}
	}

}
