package collection_framework_12_July_2022;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer>pin=new HashMap<String,Integer>();
		pin.put("Aurangabad", 431001);
		pin.put("Pune", 431002);
		pin.put("Jalna",431003);
		pin.put("Dhule", null);
		
		System.out.println(pin);
		
		for(Map.Entry<String,Integer>entry:pin.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
			
		}
		
		int a1[]= {11,15,116,184,15,1,51,55,15,155,1};
		
		ArrayList<Integer>list=new ArrayList<Integer>(a1.length);
		
		for(int k:a1) {
			list.add(k);
		}
		
		System.out.println("Printing the array : "+Arrays.toString(a1));
		list.sort(Comparator.naturalOrder());
		
		LinkedHashSet<Integer>l2=new LinkedHashSet<Integer>(list);
		
		int m1=l2.size()-1;
		int m2=l2.size()-2;
		int m3=l2.size()-3;
		System.out.println(m1+ " "+m2+" "+m3);
		
		
		

	}

}
