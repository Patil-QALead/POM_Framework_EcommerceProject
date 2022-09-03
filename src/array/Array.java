package array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array declaration
		
		int i[];
		int[] i1;
		
		
		//array instantiation
		i=new int[3];
		i1=new int[4];
		
		i1[0]=15;
		i1[1]=16;
		i1[2]=17;
		i1[3]=18;
		System.out.println(i1[2]);
		for(int cat:i1) {
			System.out.println(cat);
			
		}
		
		//array initialization
		i[0]=12;
		i[1]=14;
		i[2]=15;
		
		
		//array declaration and initialization
		int a[]=new int[4];
		
		//initialization
		a[0]=1;
		a[1]=2;
		a[2]=4;
		a[3]=5;
		System.out.println(a[2]);
		for(int b=0;b<a.length;b++) {
			System.out.println(a[b]);
		}
//array declaration ,instantiation and initialization
		int z[]= {1,2,3,4,5,6,7,8};
		System.out.println(z[2]);
		System.out.println(z.length);
		
		int y[]= {'a','b','c',9,8,10};
		System.out.println(y[0]);
		System.out.println(y[2]);
		System.out.println("Below is the for each loop");
		//for each
		for(int x:y) {
			System.out.println(x);
			
			//for each Loop Syntax
			//for(anydataitem:array/collection){//print
		}
		
	}

}
