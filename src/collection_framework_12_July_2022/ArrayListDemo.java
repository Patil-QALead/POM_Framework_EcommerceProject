package collection_framework_12_July_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListDemo {
	//it contain duplicate elements
	//java arraylist class maintain the insertion order
	//it is non synchronised or non thread safe
	//arraylist gives random access to element due to indexing form storage

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer>list_1=new ArrayList<>();
		ArrayList<String>langauges=new ArrayList<>();
		langauges.add("Java");
		langauges.add("Pyhton");
		langauges.add("PHP");
		langauges.add("Marathi");
		System.out.println("Print arraylist :"+langauges);
		
		String str=langauges.get(2);
		System.out.println("The element at index 2 is :"+str);
		
		// change the element of arraylist
		langauges.set(2, "Javascript");
		System.out.println("Modified arraylist is :"+langauges);
		
		//remove element of specified index
		String sr=langauges.remove(2);
		System.out.println("Removed element is: "+sr);
		System.out.println("New arraylist is : "+langauges);
		
		
		//sort arraylist in reverse order 
		langauges.sort(Comparator.reverseOrder());
		System.out.println("The reverse order is: "+langauges);
		
		//sort in natural order
		langauges.sort(Comparator.naturalOrder());
		System.out.println("the natural order is: "+langauges);
		
		//iterate through arraylist using foreach loop
		for(String k:langauges) {
			System.out.print(k);
			System.out.print(",");
		}
		
		langauges.sort(Comparator.nullsFirst(null));
		
		System.out.println(list_1.size());//initial array size is zero
		list_1.add(15);
		list_1.add(19);
		list_1.add(27);
		list_1.add(82);
		list_1.add(98);
		list_1.add(89);
		list_1.add(125);
		list_1.add(198);
		list_1.add(129);
		ArrayList<Integer>copied=(ArrayList<Integer>)list_1.clone();
		System.out.println("copied arraylist is :"+copied);
		list_1.sort(Comparator.naturalOrder());
		System.out.println("the ascending order of list_1 is: "+list_1);
		
		list_1.sort(Comparator.reverseOrder());
		System.out.println("the descending order of list_1 is: "+list_1);
		
		
		System.out.println(list_1.size()); //now the array size is 9
		System.out.println("Printing the elements of array"); 
		System.out.println(list_1); //printing array
		
		list_1.add(4, 500);
		list_1.add(7, 5001);
		list_1.add(500);
		list_1.add(500);
		
		
		System.out.println(list_1); //printing updated array
		
		boolean check=list_1.contains(27);
		System.out.println(check); //return true
		
		list_1.ensureCapacity(500);
		int last=list_1.get(7);
		System.out.println(last); //print the element of 7th index i.e.5001
		
		int ind=list_1.indexOf(82);
		System.out.println(ind); //it will print the indexof 82
		
		boolean emp=list_1.isEmpty();
		System.out.println(emp); //return false as arraylist is not empty
		
		System.out.println(list_1.lastIndexOf(500)); //it will print the last occurrence of 500		
		
		
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	

		System.out.println("thread is waiting");
		
		
		
		System.out.println(list_1);
		
		list_1.remove(7);
		System.out.println(list_1);
		
		list_1.set(4,	400);
		System.out.println(list_1);
		
		ArrayList<String> languages = new ArrayList<>(Arrays.asList("german", "english", "french"));
	    System.out.println("ArrayList: " + languages);

		
		
		
		
		
	}

}
