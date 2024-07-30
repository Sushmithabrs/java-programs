
 package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPrg {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("urviknagesh");
		a1.add(7.5);
		a1.add(9);
		System.out.println(a1);
		Iterator i1=  a1.iterator();
		while(i1.hasNext());
		{
			System.out.println(i1.next());
		}
	}

}
