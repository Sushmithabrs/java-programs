package program;
class a1{
	static void c1() {
		System.out.println("grand parent");
	}
}
class b1 extends a1{
static void c2() {
	System.out.println("parent");
}
}
class cc extends b1{
	static void c3()
{
		System.out.println("child1");
		}
}


public class Hybrid_inheritance extends a1 {
	static void c4()
	{
		System.out.println("child2");
	}
	public static void main(String[] args) {
		c1();
	
		c4();
		}

}

