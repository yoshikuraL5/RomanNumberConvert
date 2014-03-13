package jp.leve_five.careerup.sample;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] x = {0, 1, 2, 3, 4};
        try{
        	System.out.println("x[6]" + x[6]);
        	System.out.println("x[3]" + x[3]);
        }catch(ArrayIndexOutOfBoundsException oe){
        	
        }catch(IndexOutOfBoundsException ie){
        	
        }
        
        P p = new C();
        P pc = (P) new C();
        try{
        	p.strToNum("10");
            pc.strToNum("33");
        }catch(Exception e){
        	
        }


        
    }

}

class P{
    public void strToNum(String s)throws Exception{
    	System.out.println("P" + Integer.parseInt(s));
    }
    int getYear(){
		return 0;
    }
    int getSpeed()throws IOException{
    	return 1;
    }
}

class C extends P{
    public void strToNum(String s)throws Exception{
    	System.out.println("C" + Integer.parseInt(s));
    }
    
    int getYear()throws NullPointerException{
    	return 0;
    }
    int getSpeed(){
    	return 1;
    }
}

class Z{
	
}

