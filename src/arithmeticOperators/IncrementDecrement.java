package arithmeticOperators;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a=10;
		int b=++a;
		float c=++b + ++a + a;
		System.out.println(a);
		System.out.println(a+ ++b +c);
		System.out.println(c);
		System.out.println(c+ ++b);
				
		// TODO Auto-generated method stub

	}

}
