package array;

public class Array_10062022 {
	//logic for finding the max number from array.
	/*void max(int w[]) {
		int w1=w[0];
		for(int t=0;t<w.length;t++) {
			if(w1<w[t]) {
				w1=w[t];
				System.out.println(w1);
			}
		}
	}
	//static method
	 * 
	 */
static int max(int r[]) {
	int temp;
	for(int as=0;as<r.length;as++) {
		for(int bs=as+1;bs<r.length;bs++) {
			if(r[as]>r[bs]) {
				temp=r[as];
				r[as]=r[bs];
				r[bs]=temp;
			}
		}
	}
	return r[r.length-1];

}



	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int i[][]= {{1,2,3},{5,6,7},{7,8,9}};
		for (int a=0;a<i.length;a++) {
			for(int b=0; b<i.length;b++) {
				System.out.print(i[a][b]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Verifying error for imcomplete data");
		//incomplete data in second array
		int g[][]= {{1,2,3},{5,6},{7,8,9}};
		for (int c=0;c<g.length;c++) {
			for(int d=0; d<g[c].length;d++) {
				System.out.print(g[c][d]+ " ");
			}
			System.out.println();
		}
		
		
		/*//
		int x[][]= {{11,12,13},{17,18,19},{20,21,22,23}};
		int count=0;
		for(int z=0; z<x.length;z++) {
			for(int y=0; y<x[a].length;y++) {
				 x=count++;

			}
				}
		//
		int h[][]=new int[3][];
		h[0]=new int[3];
		h[1]=new int[3];
		h[2]=new int[2];
		
		int counts=0;
		for(int f)
				*/
	
		int w[]= {1,2,3,124};
		Array_10062022 ad=new Array_10062022();
		ad.max(w);
		System.out.println(w);
		int r[]= {11,12,13,14,15,16,17,18};
		System.out.println(max(r));
		
		//swap method using third variable for two values
		int cv=400;
		int bv=500;
		
		System.out.println("Before Swap");
		System.out.println("cv value is "+ cv +" bv values is " + bv );
		
		
		int temp;
		temp=cv;
		cv=bv;
		bv=temp;
		System.out.println("After Swap");
		System.out.println("cv value is "+ cv +" bv values is " + bv );
		
		System.out.println("swap method without using third variable");
		System.out.println();
		
		// swapping without using third variable
		int bb=1000;
		int aa=2000;
		
		System.out.println("Before Swap");
		System.out.println("bb value is "+ bb +" aa values is " + aa );
		
		bb=bb+aa; // bb=1000+2000=3000
		aa=bb-aa; // aa=3000-2000=1000; final value of int aa=1000
		bb=bb+aa; //bb=3000-1000=2000; final value of int bb=2000
		
		System.out.println("After Swap");
		System.out.println("bb value is "+ bb +" aa values is " + aa );
		

		

	}

}
