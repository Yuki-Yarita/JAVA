package Chapter4Of6Capsule;

public class Main {

	public static void main(String[] args) {
		Cat pepe = new Cat("ぺぺ", 3);
		pepe.agePlus();
		pepe.age = 0;
		pepe.name = "たま";
		pepe.showName();
		pepe.showAge();
	}
}
