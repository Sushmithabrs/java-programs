package collection;

public class TyeCastingprg1 {

	public static void main(String[] args) {
		int a=100;
		double wt= a;//implicit
		System.out.println(wt);
		double db=309.9038;
		int a1=(int) db;//explicit
    System.out.println(a1);
    byte b1=127;
    int a2=b1;
    System.out.println(a2);
	
	int i1=2349;//int to byte
	byte b2=(byte) i1;//explicit
	System.out.println(b2);
	
	}
}
