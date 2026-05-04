package q10;

class Emp implements Cloneable{
	String name;

	public Emp(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	protected void finalize()  throws Throwable{
		System.out.println("Object Deleted");
	}
	
}

public class Main {
	public static void main(String[] args) throws  CloneNotSupportedException{
		Emp emp = new Emp("ABC");
		System.out.println(emp);
		
		Emp emp2 = (Emp) emp.clone();
		System.out.println(emp2);
		
		System.out.println(emp.equals(emp2));
	}
}

