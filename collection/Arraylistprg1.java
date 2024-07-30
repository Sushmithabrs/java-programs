package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistprg1 {
	static void programArry() {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(130);
		l1.add(40);
		l1.add(12);
		l1.add(11);
		Collections.sort(l1);
		System.out.println(l1);
	}
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("sushmitha");
		a1.add("supriya");
		a1.add("anu");
		a1.add("nagesh");
		a1.add("urvik");
		Collections.sort(a1);
		System.out.println(a1);
		programArry();
		
		
	
	}

}