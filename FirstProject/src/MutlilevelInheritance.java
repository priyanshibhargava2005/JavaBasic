class Animal{	
	int age=10;
	int weight=5;
	
	void displayAnimal() {
		System.out.println("Age= "+age);
		System.out.println("Weight= "+weight);
	}
}

class Pet extends Animal{
	int isPet=1;
	
	void displayPet() {
		System.out.println("If it is a pet: "+isPet);
	}
}

class Labrador extends Pet{
	String color="White";
	
	void displayLabrador() {
		System.out.println("Colour: "+color);
	}
}

public class MutlilevelInheritance {
	public static void main(String[] args) {
		Labrador lab=new Labrador();
		lab.displayAnimal();
		lab.displayPet();
		lab.displayLabrador();
	}
}

