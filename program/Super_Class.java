package program;
//super calling statement non para
class Random{
	 Random(){
		System.out.println("Random");
		
}
}
public class Super_Class extends Random {
	 Super_Class()
	{
		 super();
	System.out.println("Supper Class");	
	}
	public static void main(String[] args) {
		
		 new Super_Class();
	}

}
