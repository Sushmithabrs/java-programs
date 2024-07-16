package program;
//super calling statement parameterized constructor
class abc{
    abc(int a) {
	 System.out.println("age:"+a);
}
}

public class Super_Calling extends abc {
	Super_Calling(String name) {
		super(27);
	 System.out.println("name is:"+name);
	}

	public static void main(String[] args) {
		new Super_Calling("sushmitha");

	}

}
