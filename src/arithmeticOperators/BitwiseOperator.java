package arithmeticOperators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Bitwise operator--->    & And,  | OR , ^(BItwise exclusive OR).
		// logical 1.&& LOGICAL AND , 2.|| Logical OR
		int a=10;
		int b=24;
		
		
		//And and Logical and Operator
		System.out.println(a<b & a>b); //left and right hand side condition must be true. It checks both condition .
		System.out.println(a<b && a>b); //left and right hand side condition must be true. It checks only one condition when if it is false.
		// and result
		//true & true =true  
		//true & false = false
		// false & true = false
		//false & false = false.
		
		
		//OR and Logical OR Operator
		System.out.println(a<b | a>b); //true or false = true
		System.out.println(a<b || a>b);// true logical or false = true
		//OR result
		// true or false = true
		// true or true = true
		// false or true = true
		// false or false =false
		
		
		//Bitwise Exclusive Operator ^
		System.out.println(a<b ^ a>b); // true ^ false = true
		System.out.println(a<b ^ a<b); // true ^ true = false
		System.out.println(a>b ^ a<b); // false ^ false = false
		System.out.println("Kishor");
		
		
	}

}
