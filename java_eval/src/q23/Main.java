package q23;

class Add{
	String add1;
	String add2;
	
	public Add(String add1, String add2) {
		this.add1 = add1;
		this.add2 = add2;
	}

	@Override
	public String toString() {
		return "Add [add1=" + add1 + ", add2=" + add2 + "]";
	}
	
	
}

class Hobb{
	String h1;
	String h2;
	
	public Hobb(String h1, String h2) {
		this.h1 = h1;
		this.h2 = h2;
	}

	@Override
	public String toString() {
		return "Hobb [h1=" + h1 + ", h2=" + h2 + "]";
	}
	
}

class Emp{
	String name;
	Add add;
	Hobb hobb;
	
	public Emp(String name, Add add, Hobb hobb) {
		this.name = name;
		this.add = add;
		this.hobb = hobb;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", add=" + add + ", hobb=" + hobb + "]";
	}
	
	
}

public class Main {
	public static void main(String[] args){
		Add add = new Add("Mumbai","Pune");
		Hobb hobb = new Hobb("ABC","XYZ");
		
		Emp emp = new Emp("PQR",add,hobb);
		System.out.println(emp);
	}

}
