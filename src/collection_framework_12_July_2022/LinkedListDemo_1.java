package collection_framework_12_July_2022;


import java.util.LinkedList;

public class LinkedListDemo_1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// it is faster than Arraylist because of nodes which links the previous and next element.
		//linnkedlist is better for manipulating the data where arraylist is better for storing and retriving the data
		//arraylist use array dynamically internally and linkedlist use doublylinkedlist  
		
		LinkedList random=new LinkedList();
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
		LinkedList<String>random1=new LinkedList<>();
			random1.add("Java");
			random1.add(null);
			random1.add("Pyhton");
			random1.add("Ruby");
			
			System.out.println(random1);
			//printing using foreachloop
			for(String str:random1) {
				System.out.println(str);
			}
			
			//adding element at first place and last place using linkedlist methods
			System.out.println("before adding element : "+random1);
			random1.addFirst("Kishor");
			random1.addLast("Patil");
			System.out.println("after adding the element: "+random1);
			
			System.out.println("using index of object ---------");
			System.out.println(random1.get(2));
			System.out.println(random1.get(3));
			

	}

}
