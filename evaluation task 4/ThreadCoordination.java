class Message{
	private String message;
	private boolean messageSent = false; 

	public synchronized void sendMessage(String message){
	
		while(messageSent){
			try{
				wait();
			}catch(Exception e){
				System.out.println(e);
			}
		}

		this.message=message;
		messageSent = true;
		notify();
	}

	public synchronized String recevieMessage(){
		while(!messageSent){
			try{
				wait();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		String receivedMessage = this.message;
		messageSent = false;
		
		notify();
		return receivedMessage;
	}
}

class SenderThread extends Thread{
	private Message message;
	public SenderThread(Message message){
		this.message=message;
	}

	public void run(){
		String[] tArray = {"Hello","Welcome","How are you"};
		for(String msg :tArray){
			message.sendMessage(msg);
			System.out.println("message sent : "+msg);
			try{
				Thread.sleep(500);
			}catch(Exception  e){
				System.out.println(e);
			}
		}
	}
}

class receiverThread extends Thread{
	private Message message;
	receiverThread(Message message){
		this.message = message;
	} 
	public void run(){
		for(int i=0;i<3;i++){
			String receivedMessage = message.recevieMessage();
			System.out.println("message received : "+receivedMessage);
			try{
				Thread.sleep(1000);
			}catch(Exception  e){
				System.out.println(e);
			}	
		}
	}
}	

public class ThreadCoordination{
	public static void main(String args[]){
		Message myMessage = new Message();

		SenderThread s = new SenderThread(myMessage);
		receiverThread r = new receiverThread(myMessage);

		s.start();
		r.start();
	}
}
