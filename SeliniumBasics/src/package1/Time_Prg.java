package package1;

import java.util.Date;

public class Time_Prg {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		//returntype long epoch time
		//human hunderstandable we can call constucture
	     Date d2=new Date(d1.getTime());
	    String human=d2.toString();
	     System.out.println(human.substring(8,10));
	     //futer time
	      Date d3=new Date(d1.getTime()+(1000*60*60*24*10));
	      System.out.println(d3);
	     
	     Date d4=new Date(d1.getTime()-(1000*60*60*24*1));
	     System.out.println(d4); 
	  
	}

}
