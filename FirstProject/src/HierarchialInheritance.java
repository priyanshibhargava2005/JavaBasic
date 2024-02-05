class Drink{	
	int litre=10;
		
	void displayDrink() {
		System.out.println("Quantity= "+litre);
	}
}

class SodaDrink extends Drink{
	String type="Mocktail" ;
	
	void displaySodaDrink() {
		System.out.println("Type is: "+type);
	}
}

class WithoutSodaDrink extends Drink{
	boolean isAlcoholic=true;
	
	void displayWithoutSodaDrink() {
		System.out.println("Is it's alcoholic: "+isAlcoholic);
	}
}

public class HierarchialInheritance {
	public static void main(String[] args) {
		Drink d=new Drink();
		d.displayDrink();
		SodaDrink sd=new SodaDrink();
		sd.displaySodaDrink();
		WithoutSodaDrink wd=new WithoutSodaDrink();
		wd.displayWithoutSodaDrink();
	}
}
