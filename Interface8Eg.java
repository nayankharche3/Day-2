package day2;

interface InterfaceEg {
void met1();
default int met2() {
	
	System.out.println("My interface met 2");
	return 0;
}
}

class MyClass implements InterfaceEg
{

	@Override
	public void met1() {
		// TODO Auto-generated method stub
		System.out.println("Myclass met 1()");
	}
	

}
public class Interface8Eg {
	public static void main(String[] args) {
		
		InterfaceEg obj=new MyClass();
		obj.met1();
	}
}