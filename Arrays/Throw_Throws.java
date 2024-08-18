package Arrays;


public class Throw_Throws {

	public static void main(String[] args) throws NullPointerException,InterruptedException{
//hrow new NullPointerException();
System.out.println("hello");
Thread.sleep(500);
System.out.println("hi");
throw new NullPointerException();
	}

}
