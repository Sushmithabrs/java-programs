package program;


public class Constructor_Method_Overloading {
 	Constructor_Method_Overloading(){
 		System.out.println("Non parameterized constructor");
 		
		
	}
 	Constructor_Method_Overloading(String name,int b){
 		System.out.println("prameterized constructor");
 	}

	public static void main(String[] args) {
	new	Constructor_Method_Overloading();
	new Constructor_Method_Overloading( "Sushmitha",20);
	
	
	}

}
