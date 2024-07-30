package assignment;

public class String_Assignment1 {

	public static void main(String[] args) {
		String name=" Sushmitha BR ";
		String name1="sushmitha BR";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(8));
		System.out.println(name.indexOf('s'));
		System.out.println(name.trim());
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.contains("BR"));
		System.out.println(name.substring(0));
		System.out.println(name.substring(1,10));
		System.out.println(name.substring(11));
		
	}

}
