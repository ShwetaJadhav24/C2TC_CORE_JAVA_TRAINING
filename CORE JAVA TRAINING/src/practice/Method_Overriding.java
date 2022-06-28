package practice;

public class Method_Overriding {

	public static void main(String[] args) {
		

	}

}

class Parent
{
	void property()
	{
		System.out.println("house....money....jewellery");
	}
	
	void marry()
	{
		System.out.println("Sri Latha");
	}
}

class child extends Parent
{
	void marry()
	{
		System.out.println("KATRINA");
	}
}