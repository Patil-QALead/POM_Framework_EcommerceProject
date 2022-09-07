package collection_framework_12_July_2022;

import java.util.Vector;

public class VectorDemo_1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//vector is like dynamic array
		//vector is threadsafe and synchronised as it is legacy part
		      Vector v=new Vector();
		      System.out.println(v.capacity());
		      v.add(10);
		      v.add(5);
		      v.add("Kishor");
		      v.add(null);
		      v.add(19);
		      System.out.println(v);
		      v.add("Mumbai");
		      v.add("Raining is very high");
		      v.add("chances of flood are more");
		      v.remove(2);
		      v.add(1, 15);
		      v.set(0, 19);
		      System.out.println(v);
		      
		      
		      Vector<String>v1=new Vector<String>();
		      v1.add("Mumbai");
		      v1.add("Raining is very high");
		      v1.add("chances of flood are more");
		    
		      System.out.println(v1);
		      
		      for(String str2:v1) {
		    	  System.out.println(str2);
		      }
	}

}
