package program;
class a
	{
	static void add() {
		int a=10;
		int b=30;
		System.out.println(a+b);
	}
		static void sub() {
			int a=40;
			int b=10;
			System.out.println(a-b);
	
}}
class b extends a{
	static void mul() {
		int a=20;
		int b=30;
		System.out.println(a*b);
	
}
	
	static void div() {
		float a=3.24f;
		double b=5.87;
		System.out.println(a/b);
	}
	
}
public class Multilevel_Inheritance extends b  {
	static void mod() {
		int a=20;
		int b=30;
		System.out.println(a%b);
	
}


	public static void main(String[] args) {
	add();	
	sub();
	mul();
	div();
	mod();
	}

}
/*
package basics.programs;
public class City_Class_program 
{
	City_Class_program(int age)
	{
		System.out.println(age);
	}
	City_Class_program(double weight)
	{	this(53);
		System.out.println(weight);
	}
	City_Class_program(String name)
	{	this(19.09);
		System.out.println(name);
	}
public static void main(String[] args) 
{
	new City_Class_program("Ram");
//	new City_Class_program(90.87);
//	new City_Class_program(21);
}
}*/