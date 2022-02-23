
class Test{
	void print(){}
}

public class Expt {

	public static void main(String[] args){
		try
		{
			System.out.println("Hello");
			Test obj = null;
			System.out.println("Welcome");
			obj.print(); 
			System.out.println("Hello Welcome");
		}
		catch(NullPointerException et)
		{
			et.printStackTrace();
			System.out.println("Exception occurred:"+et.getMessage());
		}	
	}

}
