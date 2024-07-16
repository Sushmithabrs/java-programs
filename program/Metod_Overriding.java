package program;
class Access{
      void submit() {
		System.out.println("submit");
}}
public class Metod_Overriding extends Access {
	
	 void submit() {
		super.submit();
	   System.out.println("submit");
	}
	
	public static void main(String[] args) {
		Metod_Overriding mo=new Metod_Overriding();
		mo.submit();
		
	}}

