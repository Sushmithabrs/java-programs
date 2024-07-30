package collection;

import java.util.Stack;

public class Stack_prg {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(11);
		s1.add(11);
		s1.add(11);
		s1.add(12);
		s1.add(12);
		s1.add(13);
		System.out.println(s1);
		s1.pop();
		System.out.println("pop->"+s1);
		s1.peek();
		System.out.println("peeak->"+s1);
		s1.push(111);
		System.out.println("push->"+s1);
		s1.search(12);
		System.out.println("searc->"+s1);
		System.out.println(s1.remove(2));
		//System.out.println(s1.removeElementAt(0));
        System.out.println(s1.capacity());
        //System.out.println(s1.removeAllElements());

	}

}
