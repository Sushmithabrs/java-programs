package program;
abstract class AbstractClass {
    abstract void mul();
    abstract void div();
}

public class AbstractClassExample extends AbstractClass {
    @Override
    void mul() {
        System.out.println("Multiplication");
    }

    @Override
    void div() {
        System.out.println("Division");
    }
  
public class Abstract_Assignment extends AbstractClassExample {
	 void concreteMethodOne() {
	        System.out.println("Concrete method one");
	    }

	    void concreteMethodTwo() {
	        System.out.println("Concrete method two");
	    }

	public static void main(String[] args) {
		Abstract_Assignment example = new Abstract_Assignment();
        example.concreteMethodOne();
        example.concreteMethodTwo();
        example.mul();
        example.div();
	}

}



/*package assignment;
abstract class AC{
	abstract void mul();
	abstract void div();
}
  public class AM extends AC{
	@Override
	void mul() {
		System.out.println("multiplication");
	}
	@Override
	void div() {
	System.out.println("division");
		
	}
}
public class Abstract_Class2 extends AM {
	void CM1() {
		System.out.println("concret method one");
	}
	void CM2() {
		System.out.println("concret method two");
	}
	public static void main(String[] args) {
		Abstract_Class2 ac=new Abstract_Class2();
		ac.CM1();
		ac.CM2();
		ac.mul();
		ac.div();
		}

}*/
