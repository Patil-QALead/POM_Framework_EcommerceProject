package collection_framework_12_July_2022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer>list_2=new LinkedList<>();
		ArrayList<Integer>List_3=new ArrayList<>();
		
		List_3.add(null);
		List_3.add(null);
		List_3.add(500);
		List_3.add(200);
		List_3.add(100);
		List_3.add(800);
		List_3.add(100);
		for(int i=0; i<List_3.size();i++) {
			System.out.println(List_3.get(i));
		}
		System.out.println(List_3);
		System.out.println("-----------------------------");
		
		
		list_2.add(11);
		list_2.add(15);
		list_2.add(1);
		list_2.add(19);
		list_2.add(11);
		list_2.add(null);
		
		//create a variable to strore the iterator values
		Iterator<Integer>a1=list_2.iterator();
		System.out.print("Arraylist: ");
		
		//loop throgh arraylist till it has all element
		//use methods of iterator to access the element
		while(a1.hasNext()) {
			System.out.print(a1.next());
			System.out.print(",");
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		for(int i=0; i<list_2.size();i++) {
			System.out.println(list_2.get(i));
		}
		System.out.println("-----------------------------");
		System.out.println(list_2);
		list_2.addFirst(101);
		list_2.addLast(5002);
		list_2.contains(1);
		list_2.equals(List_3);
		System.out.println("-----------------------------");
		List_3.addAll(list_2);
		System.out.println(List_3);
		System.out.println("-----------------------------");
		list_2.addAll(List_3);
		
		System.out.println(list_2);
		System.out.println("-----------------------------");
		int x=list_2.get(11);
		System.out.println(x);
		System.out.println("-----------------------------");
		int last=list_2.getLast();
		System.out.println(last);
		System.out.println("-----------------------------");
		list_2.offer(11);
		System.out.println(list_2);
		System.out.println("-----------------------------");
		list_2.offerFirst(19);
		System.out.println(list_2);
		System.out.println("-----------------------------");
		list_2.offerLast(20001);
		System.out.println(list_2);
		System.out.println("-----------------------------");
		int a=list_2.peek();
		System.out.println(a);
		
		System.out.println("-----------------------------");
		int poll=list_2.pollFirst();
		System.out.println(poll);
		System.out.println("-----------------------------");
		list_2.remove(1);
		int sizea=list_2.size();
		System.out.println(sizea);
		
		//accept the duplicate and null values
		//insertion order maintained
		
		
		
		
		
	}

}
