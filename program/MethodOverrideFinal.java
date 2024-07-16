package program;
class First{
	 final void login() {
		System.out.println("enter the login ");
	}
}

public class MethodOverrideFinal {
	void login() {
	System.out.println("login");
	}
	
	public static void main(String[] args) {
		MethodOverrideFinal mo=new MethodOverrideFinal ();
          mo.login();
	}

}
