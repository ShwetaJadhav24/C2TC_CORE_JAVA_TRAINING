package practice;

public class Static_Block {

	public static void main(String[] args) {
		
		System.out.println("Executing main block");

	}
	
	static
	{
		System.out.println("Vande Mataram");
		m();
	}
	
	static
	{
		System.out.println("I love India");
	}
	
	static
	{
		System.out.println("Jai Hind");
		
	}
	
	static void m()
	{
		System.out.println("Bharat");
	}

}
