class Dog{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void dogBarks() {
		System.out.println(this.name+"is barking");
	}
	
}

public class Dogfunctions{
	public static void main(String[]args) {
		Dog newDog= new Dog();
		System.out.println("Before getter and setters");
		System.out.println(newDog.getName());
        System.out.println(newDog.getAge());
        newDog.setName("Tommy");
        newDog.setAge(5);
        System.out.println("After getter and setter methods");
        System.out.println(newDog.getName());
        System.out.println(newDog.getAge());
	}
}
