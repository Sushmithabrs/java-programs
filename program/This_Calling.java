package program;

public class This_Calling {
	This_Calling (String name){
		System.out.println(name);
	}
	This_Calling (int age){
		this("sushmitha");
		System.out.println(age);
	}
	This_Calling (double marks){
		this(27);
		System.out.println(marks);
	}
	This_Calling (char gender){
		this(78.976);
		System.out.println(gender);
	}

	public static void main(String[] args) {
		new This_Calling('f');
	}

}