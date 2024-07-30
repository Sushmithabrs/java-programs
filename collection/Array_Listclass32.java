package collection;

import java.util.ArrayList;

public class Array_Listclass32 {

	public static void main(String[] args) {

ArrayList a1=new ArrayList();
	a1.add("urviknagesh");
	a1.add(7.5);
	a1.add(9);
System.out.println("a1-"+a1);
ArrayList a2=new ArrayList();
a2.addAll(a1);
a2.add("sushmitha");
a2.add(53);
System.out.println("a2-"+a2);
a1.add(1,"ammu");
a1.add(2,10);
a1.add(3,10.9);
System.out.println(a1);
	}

}
