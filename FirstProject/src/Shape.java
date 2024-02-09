//method overloading, method overriding
//rules: for overloading: paramenter, datatype and sequence should be diff, should be in same class
//rules for overriding: diff classes but same method, method no. of parameters should be same
//upcasting: parent class data type and child class object

class shape_r{
	void area(int a, int b) {
		System.out.println("Area");
	}
}

class Rectangle extends shape_r{
	void area(int a, int b) {
		System.out.println("Area: "+ a*b);
	}
}

class Triangle extends shape_r{
	void area(int a, int b) {
		System.out.println("triangle area: "+ 0.5f*a*b);
	}
}

public class Shape{
	
	public static void main(String[] args) {
		
		shape_r r = new Rectangle();
		r.area(10, 20);
		shape_r t = new Triangle();
		t.area(10, 20);
		
	}
}
