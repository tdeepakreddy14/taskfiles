class thread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() +" : "+i);
		}
		System.out.println(Thread.currentThread().getName()+" completed");
	}
}

class thread2 extends Thread{
	public void run() {
			
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName() +" : "+i);
			}
			System.out.println(Thread.currentThread().getName()+" completed");
	}
}
public class JoinDemo {
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		
		t1.setName("thread1");
		t2.setName("thread2");
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
		
	}
}
