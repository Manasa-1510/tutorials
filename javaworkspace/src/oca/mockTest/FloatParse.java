package oca.mockTest;

public class FloatParse{
	public static void parse(String args){
		
		try{
			float f = Float.parseFloat(args);
		}catch(NumberFormatException nfe){
			f = 0;
		}finally{
			System.out.println(f);
		}
	}

	public static void main(String... args){
		parse("invalid");
	}
}