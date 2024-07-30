package collection;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("sushmitha"); 
		s1.append("nagesh");
		System.out.println(s1);
		System.out.println(s1.reverse());
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf("s"));
		System.out.println(s1.replace(0,9,"urvik"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(0,9));
		System.out.println(s1.insert(1, 'n'));

	}

}
