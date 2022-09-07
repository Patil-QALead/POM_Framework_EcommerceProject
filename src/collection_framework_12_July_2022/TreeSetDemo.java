package collection_framework_12_July_2022;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet<String>details=new TreeSet<>();
	details.add("I am  a Kishor");
	details.add("Currently working as a QA since last 2 yr");
	details.add("now the class is about to end");
	details.add("must get good job asap");
	
	for(String k:details) {
		System.out.println(k);
	}
	
	TreeSet<Integer>marks=new TreeSet<>();
	marks.add(500);
	marks.add(900);
	marks.add(17);
	marks.add(895);
	marks.add(11);
	marks.add(1847);

	int highest=marks.first();//print the first element from given set
	int leasthighest=marks.higher(500);//print the least higher element from given element
	int high=marks.last();//print the highest element from the set
	System.out.println(highest);
	System.out.println(leasthighest);
	System.out.println(high);
	System.out.println(marks.subSet(11, 500));//print the subset within range excluding ending element
	
	
	System.out.println(marks);
for(int i:marks) {
	System.out.println(i);
}

//it orders the element in ascending order by default.
try {
marks.add(null); // it does not accept the null values
System.out.println(marks);
}
catch(Exception e) {
System.err.println("It does accept null values");
}
marks.add(500); //it does not accept duplicate values
System.out.println(marks);

//the retrival time is faster as compared to LinkedHashSet and HashSet.

	}
	

}
