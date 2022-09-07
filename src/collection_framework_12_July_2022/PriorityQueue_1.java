package collection_framework_12_July_2022;
import java.util.*;
public class PriorityQueue_1 {

	public static void main(String[] args) {
		PriorityQueue<String>pq1=new PriorityQueue<String>();
		pq1.add("Kishor");
		pq1.add("Ram");
		pq1.add("Yogesh");
		pq1.add("Kaka");
		pq1.add("JIJI");
		pq1.add("AAi");
		pq1.add("Kishor");
		
		System.out.println("Elements of Priority Queue are :");
		System.out.println(pq1);
		for(String a:pq1) {
			System.out.println(a);
		}
PriorityQueue<String>pq2=new PriorityQueue<String>(pq1);
System.out.println(pq2);
 pq2.addAll(pq1);

 


	}

}
