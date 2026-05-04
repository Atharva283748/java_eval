package q7;
class InvalidOperationException extends Exception{
	InvalidOperationException(){
		System.out.println("Invalid operation");
	}
}

public class Main {
	static void cal(int a,int b,String op) throws InvalidOperationException{
		if(op=="+"){
			System.out.println(a+b);
		}else if(op=="-"){
			System.out.println(a-b);
		}else if(op=="*"){
			System.out.println(a-b);
		}else if(op=="/"){
			System.out.println(a/b);
		}else{
			throw new InvalidOperationException();
		}
	}
	public static void main(String[] args) throws InvalidOperationException{
		try{
			cal(1,2,"s");
			
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
