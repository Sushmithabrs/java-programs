package collection;
class ParentClass {
void add() {
	System.out.println("add");
	
}
void sub() {
	System.out.println("sub");
	
}
}

public class UpcastingPrg1 extends ParentClass {
	void div() {
		System.out.println("div");
		
	}
	void mul() {
		System.out.println("mul");
	
	}

	public static void main(String[] args) {
		//upcasting
		ParentClass p1=new UpcastingPrg1() ;//implicit manner
		p1.add();
		p1.sub();
		
		ParentClass p2=(ParentClass)new UpcastingPrg1() ;
		UpcastingPrg1 u1=(UpcastingPrg1) p1;
	      u1.add();
	      u1.div();
	      u1.sub();
	      u1.mul();
	
	}
	
}
