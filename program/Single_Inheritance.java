package program;

class abc1{
	static void Parent1(){
	
	System.out.println("parent class");
	}
	static void parent2(){
		System.out.println("parent2");
		}
	}


public class Single_Inheritance extends abc1 {
	static void Child() {
	System.out.println("child class");
	
	
	}
	public static void main(String[] args) {
		Parent1();
		parent2();
		Child();
	}

}
