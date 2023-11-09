class Table{
	private int count = 0; 
	
	public synchronized void increment(){
		System.out.println(++count);
	}
	public  synchronized void decrement(){
		System.out.println(--count);
	}
}
class MyThread extends Thread{
	static Table th = new Table();
	
	public void run() {
		th.increment();
		th.increment();
		th.increment();
	}
}
public class SynchronizationDemo{
	public static void main(String args[]){
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.start();
		thread2.start();		
	}
}
