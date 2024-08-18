package enumeration;
class Parent
{
	int age=18;
	
public void setAge(int age) {
		this.age=age;
		
	}
	public int getAge() {
		return age;
	}
	private String un="Grotechminds";


public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}


public class GetterandSetter {

	public static void main(String[] args) {
		Parent p1=new Parent();
		p1=setAge(12);
		System.out.println(p1.getAge());
	}

}

}
