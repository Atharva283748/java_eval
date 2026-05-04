package q22;

class Emp{
	String name;
	int age;
	
	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
	
}

public class Main {
	public static void main(String[] args){
		Emp emp = new Emp("ABC",20);
		System.out.println(emp);
	}
}
