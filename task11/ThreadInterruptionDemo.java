class thread extends Thread{
	public void run(){
		try{
			for(int i =0;i<Integer.MAX_VALUE;i++){
				System.out.println("thread is working");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}

public class ThreadInterruptionDemo {
	public static void main(String[] args) {
		try{
			thread a=new thread();
			a.start();
			Thread.sleep(5000);
			a.interrupt();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}	