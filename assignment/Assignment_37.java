package assignment;

public class Assignment_37 {

	public static void main(String[] args) {
		
		String s="Sushmitha a";
		String name="manish kumar tiwari";
		String name1="tom";
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf('a'));		
		System.out.println(s.replace('a','r')); 
		System.out.println(s.replaceAll(" a","BR"));
		System.out.println(name.matches("m(.*)i"));
		System.out.println(name.matches("(.*)t(.*)"));
		System.out.println(name.matches("m(.*)t(.*)i"));
		System.out.println(name.matches("s(.*)i(.*)a"));
		System.out.println(name1.matches("..."));
		System.out.println(s.matches("..........."));
	}

}
/*1.write a program for remaining methods of 
 * string(isempty,lastindexof,replace,replaceall,) 
 *  2.write a program for matches string function for
 *   4 questions given in class 22 i.e 
 *    1.check given string ends with i for
 *     string manish kumar tiwari 2.
 *     check given string starts with m 3
check if letter k is present or not 4.
 */
 /*check if given string tom,has 
 3 characters or not(as per class 22)
 */