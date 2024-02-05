class Parent{
	int a = 20;
	
	void displayParent() {
		System.out.println("Parent A= "+a); //autoboxing
	}
}

class Child extends Parent{
	int b=30;
	
	void displayChild() {
		System.out.println("Parent A= "+a);
		System.out.println("Parent B= "+b);
	}
}

//only the class which contains main method only that has to be public
public class SingleInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.displayChild();
		c.displayParent();	
	}

}
