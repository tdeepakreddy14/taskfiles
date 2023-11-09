class myThread extends Thread{
	public void run(){
		for(int i =0;i<5;i++){
			System.out.println("Thread is executing");
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

public class threadIsAliveDemo{
	public static void main(String args[]){
		myThread thread = new myThread();
		System.out.println("is thread alive before starting : " + thread.isAlive());
		thread.start();
		System.out.println("thread started execution");
		System.out.println("is thread alive after starting : " + thread.isAlive());
		try{
			thread.join();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("is thread alive after completion : " + thread.isAlive());

	}
}