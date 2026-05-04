package q12;

class Parent{
	String name="Parent";
	Parent(){
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent{
	Child(){
		super();
		System.out.println("child constructor");
		System.out.println(super.name);
	}
}

public class Main {
	
	public static void main(String[] args){
		Child c = new Child();
	}

}
