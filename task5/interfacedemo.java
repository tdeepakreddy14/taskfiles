package task5;
interface vehicle{
	void start();
	default void stop() {
		System.out.println("stop the vehicle");
	}
}
class car implements vehicle{
	public void start() {
		System.out.println("starting the car");
	}
	public void stop(){
		System.out.println("stopping the car");
	}
}
class bike implements vehicle{
	public void start() {
		System.out.println("starting the bike");
	}
	public void stop() {
		System.out.println("stopping the bike");
	}
}
public class interfacedemo {
	public static void main(String[] args) {
		car c = new car();
		c.start();
		c.stop();
		bike b = new bike();
		b.start();
		b.stop();
	}
}
