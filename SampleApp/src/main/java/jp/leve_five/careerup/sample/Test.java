package jp.leve_five.careerup.sample;

class A{
	A(){
		
	}
	A(String message){
		System.out.println(message + " from A.");
	}
}
class B extends A{
	B(){
		super("");
		System.out.println("Hello B.");
	}
}


public class Test {
	public static void main(String args[]){
		boolean x = true;
		boolean y = false;
		int i = 1;
		int j = 1;
		if((i++ == 1) && (y = true))i++;
		if((++j == 1) && (x = false))j++;
		

	}
	
}
