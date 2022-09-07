package collection_framework_12_July_2022;

import java.util.Stack;

public class StackDemo_1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// it is a legacy class
		//stack works as last in first out i.e. LIFO
		//push method use to put the element in stack object and pop method is used to delete the last element from stack
		Stack st=new Stack();
		st.add(15);
		st.add(19);
		st.add("No use");
		st.add(19);
		st.add("Java");
		System.out.println(st);
		
		st.remove(0);
		System.out.println(st);
		System.out.println(st.empty());
		
		st.clear();
		System.out.println(st.empty());
		
		
		
		st.push(1);
		System.out.println(st);
		
		//generic stack
		Stack<Integer> st1=new Stack<Integer>();
		st1.push(1);
		st1.push(2);
		st1.push(19);
		st1.push(19);
		st1.push(20);
		
		System.out.println(st1);
		st1.pop();
		System.out.println(st1);
		
		
	}

}
