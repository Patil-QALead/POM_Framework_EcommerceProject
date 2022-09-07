package collection_framework_12_July_2022;

import java.util.LinkedHashSet;

class collection_1{
	
	int a;
	String b;
	double c;
	boolean d;
	
	//this constructor is used to initialize the above instance variable during object creation.
	collection_1(int a,String b,double c,boolean d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
}

public class LinkedHashSetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked", "unlikely-arg-type" })
	public static void main(String[] args) {
		//initialized the instance variable and stored in ojects .
		collection_1 cl1=new collection_1(101,"AURANGABAD",198.10,true);
		collection_1 cl2=new collection_1(102,"PUNE",205.11,false);
		collection_1 cl3=new collection_1(103,"DELHI",194.11,true);
				
		//LinkedHashSet can save Homogenous as well as heterogeneous data. 
	//to save homegenous type data we need to provide generic<>datatype during object creation
		LinkedHashSet studentData=new LinkedHashSet();
		studentData.add("Kishor Kere");
		studentData.add(15000);
		studentData.add("Bhargavi Kere");
		studentData.add(580000);
		studentData.add(true);
		studentData.add(null);
		studentData.add("Kishor Kere");
		studentData.add("Aarti The Great Leader");
		
		
		
		
		
		System.out.println(studentData);
		System.out.println(studentData.contains(15000));
		System.out.println(studentData.contains("America"));
		System.out.println(studentData.isEmpty());
		System.out.println(studentData.size());
		System.out.println(studentData.hashCode());
		
		
		//inserted objects of collection_1 class in LinkHashSet class object.
		LinkedHashSet <collection_1>derived=new LinkedHashSet<>();
		derived.add(cl1);
		derived.add(cl2);
		derived.add(cl3);
		
		
		System.out.println("_________________________________printing using forloop");
		for(collection_1 cl:derived) {
			System.out.println(cl.a+" "+cl.b+" "+cl.c);
		}
		
		
		
		for(int i=0; i<studentData.size();i++) {
			System.out.print(i);
			System.out.print(" ,");
		}
		
		LinkedHashSet<String>studentNames=new LinkedHashSet<>();
	
		String names2[]= {"TCS","Infosys","Cognizant","HDFC","IDBI","Barclays","Deloitee"};
		String names3[]= {"RENU","DIVYA","SUCHITA","PRIYA","PRIYANKA","BHARGAVI","AARTI"};
		String names4[]= {"INDIA","PAKISTAN","SHRILANKA","INDONESIA","MEXICO","THAILAND","UK"};
		
		studentNames.add("Kishor");
		studentNames.add("Renu");
		studentNames.add("Divya");
		studentNames.add("Rahul");
		studentNames.add("Bhargavi");
		
		System.out.println(studentNames);
		System.out.println(studentNames.size());
			
		for(String s:studentNames) {
			System.out.println(s);
		}
		
		for(String a2:names2) {
			studentNames.add(a2);
		}
		System.out.println("the updated studentNames is: "+studentNames);
		
		for(String a3:names3) {
			studentNames.add(a3);
		}
		System.out.println("the updated studentNames is: "+studentNames);
		
		
		for(String a4:names4) {
			studentNames.add(a4);
		}
		System.out.println("the updated studentNames is: "+studentNames);
		
		studentNames.remove(names2);
		studentNames.remove("Kishor");
		
		System.out.println(studentNames);
		
		studentNames.clear();
		System.out.println(studentNames);
		
		//Imp.points of LinkedHashSet class
		//it does not accept duplicate values.
		//it stores the data in insertion order
		//it allows null entry
		//it is non-syncronized. not thread safe.
		
	
		
		

	}

}
