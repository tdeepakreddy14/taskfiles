class priority extends Thread{
	private String threadName;
	public priority(String threadName){
		this.threadName = threadName;
	}
	public void run(){
		System.out.println(threadName+" priority: "+getPriority());
	}
}

public class ThreadPriority{
	public static void main(String args[]){
		priority a = new priority("thread1");
		priority b = new priority("thread2");
		priority c = new priority("thread3");

		a.setPriority(1);
		b.setPriority(6);
		c.setPriority(10);
	
		a.start();
		b.start();
		c.start();
	}
}