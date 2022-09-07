package collection_framework_12_July_2022;

import java.util.PriorityQueue;

public class PriorityQueDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// legacy class
		PriorityQueue pq=new PriorityQueue();
		pq.add(120);
		pq.add(199);
		pq.add(1982);
		pq.add(1);
		pq.add(1005);
		pq.add(5002);
		pq.add(1995);
		pq.add(3);
		
		System.out.println(pq);
		System.out.println(pq);
//		System.out.println("the lowest values from queue is : "+pq.peek());
		System.out.println("lowest removed values is: "+pq.poll());//removes the lowest values from queue
//		System.out.println("the lowest value from queue is : "+pq.peek());//lowest values from the queue prints or retrive
		System.out.println(pq);
		System.out.println(pq);
	}

}
