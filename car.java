public class car {
	private String colour,brand,engine,cartype;
	private double bootspace,price;
	private boolean ac,musicsystem,navigation;

	public void setcolour(String colour) {
		this.colour = colour;
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public void setengine(String engine) {
		this.engine=engine;
	}
	public void setbootspace(double bootspace) {
		this.bootspace=bootspace;
	}
	public void setac(boolean ac) {
		this.ac = ac;
	}
	public void setmusicsystem(boolean musicsystem) {
		this.musicsystem=musicsystem;
	}
	public void setnavigation (boolean navigation) {
		this.navigation=navigation;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setcartype(String cartype) {
		this.cartype=cartype;
	}
	
	public String getcolour() {
		return colour;
	}
	public String getbrand() {
		return brand;
	}
	public String getengine() {
		return engine;
	}
	public double getbootspace() {
		return bootspace;
	}
	public boolean getac() {
		return ac;
	}
	public boolean getmusicsystem() {
		return musicsystem;
	}
	public boolean getnavigation () {
		return navigation;
	}
	public double getprice() {
		return price;
	}
	public String getcartype() {
		return cartype;
	}
	
	public String toString(){
		return colour+" colour, "+brand+", "+engine+", "+bootspace+" lt's, ac : "+ac+", musicsystem : "+musicsystem+", navigation : "+navigation+", "+price+" /Rs, "+cartype;
	}
	public String startengine() {
		String start = "starting the car ";
		return start ;
	}
	public String movethecar() {
		String move = "moving the car";
		return move;
	}
	public String playmusic() {
		String result;
		if(musicsystem) {
			result = "playing music";
		}
		else{
			result = "no music system";
		}
	return result;
	}
	public String applybreak() {
		String breake = "applying the break";
		return breake;
	}
	public static void main(String[] args) {
		car mycar = new car();
		mycar.setcolour("red");
		mycar.setbrand("virtus");
		mycar.setengine("bs6");
		mycar.setbootspace(400);
		mycar.setac(true);
		mycar.setmusicsystem(true);
		mycar.setnavigation(false);
		mycar.setprice(1500000);
		mycar.setcartype("sedan");
		System.out.println("car details : "+mycar+"\n\nCAR FUNCTIONALITYS -  " + mycar.startengine() +", "+ mycar.movethecar() +", "+ mycar.playmusic() +", "+ mycar.applybreak());
		
	}
}
