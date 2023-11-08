class Table{
	public synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class MyThread extends Thread{
	Table th;
	int n;
	public MyThread(Table th,int n){
		this.th = th;
		this.n = n ;
	}
	public void setNum(int n){
		this.n = n;
	}
	public void run(){
		th.printTable(n);
	}
}

public class SynchronizationDemo{
	public static void main(String args[]){
		Table table = new Table();
		MyThread thread1 = new MyThread(table,2);
		MyThread thread2 = new MyThread(table,10);
		thread1.start();
		thread2.start();
	}
}