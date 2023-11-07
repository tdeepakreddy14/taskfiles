class evenThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i+"is even");
			}
		}
}
}

class oddThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2 != 0){
				System.out.println(i+"is odd");
			}
		}
}
}
class EvenOddThread{
	public static void main(String args[]){
		evenThread even = new evenThread();
		oddThread odd = new oddThread();
		even.start();
		odd.start();
		System.out.println("c t : "+Thread.Current)
	}
}