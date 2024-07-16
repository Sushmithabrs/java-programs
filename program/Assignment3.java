package program;
//call multiple static method
public class Assignment3 {
	static void add() {
		int a=5;
		int b=3;
		System.out.println(a+b);
		}
	static void sub(){
       int a=10;
       int b=5;
       System.out.println(a-b);
	}
	static void mul() {
		int a=20;
		int b=10;
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
	  add();
	  sub();
	  mul();

	}

}
