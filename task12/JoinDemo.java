class thread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread1 : "+i);
		}
		System.out.println("thread 1 completed");
	}
}

class thread2 extends Thread{
	public void run() {
			
			for(int i=0;i<10;i++) {
				System.out.println("Thread2 : "+i);
			}
			System.out.println("thread 2 completed");
	}
}
public class JoinDemo {
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
	}
}
