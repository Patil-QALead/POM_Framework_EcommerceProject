package collection_framework_12_July_2022;

import java.util.ArrayList;

public class ArrayListDemo_1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it contain duplicate elements
		//java arraylist class maintain the insertion order
		//it is non synchronised or non thread safe
		//arraylist gives random access to element due to indexing form storage
		//shifting of element is more in arraylist
		ArrayList random=new ArrayList();
		random.add(15);
		random.add(15);
		random.add(19);
		random.add("Kishor");
		random.add(11.05);
		random.add('K');
		
		System.out.println(random);
		System.out.println("using for loop----------");
		
		//
		for(Object o:random) {
			System.out.println(o);}
			
			
			
			//Generic arraylist ---string datatype
			ArrayList<String>random1=new ArrayList<>();
			random1.add("Java");
			random1.add(null);
			random1.add("Pyhton");
			random1.add("Ruby");
			
			System.out.println(random1);
			//printing using foreachloop
			for(String str:random1) {
				System.out.println(str);
			}
			
			System.out.println("using index of object ---------");
			System.out.println(random1.get(2));
			System.out.println(random1.get(3));
			
			
			
		}
		
	}


