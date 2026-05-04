package q3;
class Bank{
	public double getROI(){
		return 0.5;
	}
}

class Axis extends Bank{
	@Override
	public double getROI() {
		return 0.7;
	}
}

class Sbi extends Bank{
	@Override
	public double getROI() {
		return 0.9;
	}
}
public class Main {
 public static void main(String[] args){
	Bank b;
	
	b = new Bank();
	System.out.println(b.getROI());
	
	b = new Axis();
	System.out.println(b.getROI());
	
	b= new Sbi();
	System.out.println(b.getROI());
 }
}
