package q27;

class Emp{
	String name;

	public Emp(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}
	
	protected void finalize()  throws Throwable{
		System.out.println("Object Deleted");
	}
	
}

public class Main {
	public static void main(String[] args){
		Emp emp = new Emp("ABC");
		System.out.println(emp);
		emp=null;
		System.gc();
	}
}
