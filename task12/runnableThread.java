class thread implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println("even number : "+i);
			}
		}
	}
}

public class runnableThread{
	public static void main(String args[]){
		thread myThread = new thread();
		Thread a = new Thread(myThread);
		a.start();
	}
}