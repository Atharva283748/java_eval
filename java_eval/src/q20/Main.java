package q20;

public class Main {
	static double cal(int a,int b) throws ArithmeticException{
		return a/b;
	}
	
	public static void main(String[] args){
		try{
			double res = cal(2,0);
			System.out.println(res);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
