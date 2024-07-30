package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Prg {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
		a1.add("sushmitha");
		a1.add("nagesh");
		a1.add("urvik");
		
		
		ListIterator i2=a1.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
	}

}
