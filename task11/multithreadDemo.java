class thread1 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("this is thread 1 : "+i);
		}
	}
}
class thread2 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("this is thread 2 : "+i);
		}
	}
}
class thread3 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("this is thread 3 : "+i);
		}
	}
}
class multithreadDemo{
	public static void main(String args[]){
		thread1 th1 = new thread1();
		thread2 th2 = new thread2();
		thread3 th3 = new thread3();
		th1.start();
		th2.start();
		th3.start();
	}
}