
public class SimpleConstructor {
	int a;
	public SimpleConstructor() {
		System.out.println("Default Constructor called: ");
		a=10;
	}
	public SimpleConstructor(int a) {
		System.out.println("Parameterized COnstructor called: ");
		this.a=a;
	}
	public static void main(String[] args) {
		SimpleConstructor simpleconstructor1= new SimpleConstructor();
		SimpleConstructor simpleconstructor2= new SimpleConstructor(50);
		System.out.println(simpleconstructor1.a);
		System.out.println(simpleconstructor2.a);
	}
}
