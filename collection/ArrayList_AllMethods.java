package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_AllMethods {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ram");
		a1.add("sitha");
		a1.add("lakshman");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("sushmitha");
		a1.add(1,"nagesh");
		a2.remove("lakshman");
		a2.contains("susmitha");
		a2.containsAll(a1);
		System.out.println("a2containsAll->"+a2);
		System.out.println("a2->"+a2);
		System.out.println("a1->"+a1);
		System.out.println(a2.contains("sushmitha"));
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println(a1);
		System.out.println(a2.size());
		System.out.println(a1.size());
	System.out.println(a2.isEmpty());
	Iterator i1=a1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
}}