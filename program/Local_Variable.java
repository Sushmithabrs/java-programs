package program;
//declare,initialization and Update local variable
public class Local_Variable {
    static void add(int a ,int b) {
    	 a=30;
    	 b=40;
    	System.out.println(a+b);
    	}
  static void sub(int a,int b) {
	  a=80;
	  b=40;
    	System.out.println(a-b);
    }

	public static void main(String[] args) {
      add(10,20);
  
     sub(5,3);
        

	}

}
