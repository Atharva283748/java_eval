package q24;

class Acc{
	
	void calSal(int sal){
		System.out.println(sal);
	}
	
	void calSal(int sal,int bonus){
		System.out.println(sal+bonus);
	}
	
	void calSal(int sal,int bonus,int tax){
		System.out.println(sal+bonus-tax);
	}
}

public class Main {
	public static void main(String[] args){
		Acc acc = new Acc();
		acc.calSal(2000);
		acc.calSal(2000, 200);
		acc.calSal(2000, 200, 20);
	}
}
