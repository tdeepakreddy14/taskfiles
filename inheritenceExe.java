class animal{
	public void walk() {
		System.out.println("I am walking ");
	}
}
class bird extends animal{
	public void fly() {
		System.out.println("I am flying");
	}
}
class SingingBird extends bird {
	public void sing() {
		System.out.println("I am singing ");
	}
}
class inheritenceExe{
	public static void main(String[] args) {
		SingingBird obj = new SingingBird();
		obj.walk();
		obj.fly();
		obj.sing();
	}
}