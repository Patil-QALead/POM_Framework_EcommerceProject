package array;

public class MultiDimensional_Array {
	
	public static void main(String[] args) {
		//single dimensional array
		int[] month_Days=new int[12];
		month_Days[0]=31;month_Days[6]=31;
		month_Days[1]=28;month_Days[7]=30;
		month_Days[2]=31;month_Days[8]=31;
		month_Days[3]=30;month_Days[9]=31;
		month_Days[4]=31;month_Days[10]=30;
		month_Days[5]=30;month_Days[11]=31;
		System.out.println("First Month Days Are " + month_Days[0]);//it'll print value stored in array for index zero i.e.first value
		System.out.println("Fourth Month Days Are " + month_Days[3]);//it'll print value stored in array for index three i.e forth value
		System.out.println("Seventh Month Days Are " + month_Days[6]);//it'll print value stored in array for index six i.e.seventh value
		 
		//Printing array values using "for each" loop
	for (int cat:month_Days) {
		System.out.print(cat + " ");  //Here printing all values in single line using space
		}
	System.out.println();
	for(int i=4; i<month_Days.length;i++) {
		for(int j=0; j<=i;j++) {
			System.out.print("!");//It will print "!" if inner loop condition found true
					}
		System.out.println();//Printing empty line after every iteration
		System.out.println(i);//Printing the index number of array month_Days
		System.out.println(month_Days[i]);//Priting values stored in array using "variable i" of for loop
	}
	 
	System.out.println("Below example are of Multidimensional array");
		//TWO DIMENSIONAL ARRAY 
		//declaration Data_Type[][] Array_Name = new int[Row_Size][Column_Size];
int[][]studentArray= {{70,800,10},{10,20,40},{40,50,40},{80,45,80}};
System.out.println("Element at studentArrya[0][0]" + studentArray[0][0]);
System.out.println("Element at studentArrya[0][1]" + studentArray[0][1]);
System.out.println("Element at studentArrya[0][2]" + studentArray[0][2]);
System.out.println("Element at studentArrya[1][0]" + studentArray[1][0]);
System.out.println("Element at studentArrya[1][1]" + studentArray[1][1]);
System.out.println("Element at studentArrya[1][2]" + studentArray[1][2]);
System.out.println("Element at studentArrya[2][0]" + studentArray[2][0]);
System.out.println("Element at studentArrya[2][1]" + studentArray[2][1]);
System.out.println("Element at studentArrya[2][2]" + studentArray[2][2]);
System.out.println("Printing the whole array using for loop");
for(int d=0;d<4;d++) {
	for(int e=0; e<3;e++) {
		System.out.print(studentArray[d][e]+ " ");
	}
	System.out.println();
}

System.out.println("This is the another example");
//example	
			
		int stock[][]= {{1,2,3},{3,4,5},{6,7,8}};
		for(int s=0;s<3;s++) {
			for(int n=0;n<3;n++) {
				System.out.print(stock[s][n]+ " ");
			}
			System.out.println();
		}
		
	}
}

