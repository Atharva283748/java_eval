package q8;

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
	Bank bank = new Bank();
	System.out.println(bank.getROI());
	
	Axis axis = new Axis();
	System.out.println(axis.getROI());
	
	Sbi sbi = new Sbi();
	System.out.println(sbi.getROI());
 }
}
