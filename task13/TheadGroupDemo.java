class MyGroup extends Thread{
	public MyGroup(ThreadGroup group,String name){
		super(group,name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" is running ");
		try{
			Thread.sleep(500);
		}catch(Exception  e){
			System.out.println(e);
		}
	}	
}

public class TheadGroupDemo{
	public static void main(String args[]){
		ThreadGroup mygroup = new ThreadGroup("MyThreadGroup");

		MyGroup thread1 = new MyGroup(mygroup,"thread1");
		MyGroup thread2 = new MyGroup(mygroup,"thread2");
		MyGroup thread3 = new MyGroup(mygroup,"thread3");

		thread1.start();
		thread2.start();
		thread3.start();
		
	        System.out.println("Thread Group Name: " + mygroup.getName());
        	System.out.println("Active Threads Count: " +mygroup.activeCount());
		System.out.println("parent group: " +mygroup.getParent());
		mygroup.list();
	}	

}