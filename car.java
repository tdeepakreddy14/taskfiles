public class car {
	private String colour;
	private String brand;
	private String engine;
	private double bootspace;
	private boolean ac; 
	private boolean musicsystem;
	private boolean navigation;
	private double price;
	private String cartype;
	public car(String colour,String brand,String engine,double bootspace,boolean ac,boolean musicsystem,boolean navigation,double price,String cartype) {
		this.colour = colour;
		this.brand = brand;
		this.engine = engine;
		this.bootspace = bootspace;
		this.ac = ac;
		this.musicsystem = musicsystem;
		this.navigation = navigation;
		this.price = price;
		this.cartype = cartype; 
	}
	public void display_car_info() {
		System.out.println("colour: "+colour);
		System.out.println("brand: "+brand);
		System.out.println("engine: "+engine);
		System.out.println("boot space: "+bootspace);
		System.out.println("ac: "+ac);
		System.out.println("musicsystem: "+musicsystem);
		System.out.println("navigation: "+navigation);
		System.out.println("price: "+price);
		System.out.println("car type: "+cartype);
	}
	public void startthecar() {
		System.out.println("starting the car ");
	}
	public void movethecar() {
		System.out.println("moving the car");
	}
	public void playmusic() {
		if(musicsystem) {
			System.out.println("playing music");
		}
		else{
			System.out.println("no music system");
		}
	}
	public void applybreak() {
		System.out.println("applying the break");
	}
	public static void main(String[] args) {
		car mycar = new car("red","virtus","bs6",400,true,true,false,1500000,"sedan");
		System.out.println("CAR DETAILS - ");
		System.out.println("");
		mycar.display_car_info();
		System.out.println(' ');
		System.out.println("CAR FUNCTIONALITYS - ");
		mycar.startthecar();
		mycar.movethecar();
		mycar.playmusic();
		mycar.applybreak();
	}
}
