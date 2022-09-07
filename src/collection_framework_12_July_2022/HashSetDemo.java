package collection_framework_12_July_2022;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer>Mob_numbers=new HashSet<>();
	
		int a=Mob_numbers.size();
		Mob_numbers.add(10001);
		Mob_numbers.add(20001);
		Mob_numbers.add(30001);
		Mob_numbers.add(40001);
		Mob_numbers.add(50001);
		Mob_numbers.add(60001);
		Mob_numbers.add(70001);
		Mob_numbers.add(80001);
		Mob_numbers.add(90001);
		Mob_numbers.add(11001);
		Mob_numbers.add(21001);
		Mob_numbers.add(31001);
		Mob_numbers.add(10001);
		int b=Mob_numbers.size();
		System.out.println("HashSet size before adding the elements: "+a);
		System.out.println("HashSet size after adding the elements: "+b);
		System.out.println(Mob_numbers);
	    
		for(int i:Mob_numbers) {
			System.out.println(i);
		}
	Mob_numbers.remove(10001);
	System.out.println(Mob_numbers);

	//it accpet unique element only.
	//sorting is based on hashcode of the elements.
	//it accept the null value.
	//this class is best for searching purpose of element
	
	
	}



}
