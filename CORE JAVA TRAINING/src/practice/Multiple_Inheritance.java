package practice;

interface A
{
	void Adisplay();
}

interface B
{
	void Bdisplay();
}

class MIE implements A,B //Multiple Inheritance
{
	public void Bdisplay()
	{
		System.out.println("I am A interface");
	}
	
	public void Adisplay()
	{
		System.out.println("I am B interface");
	}
}

public class Multiple_Inheritance {

	public static void main(String[] args) 
	{
	      MIE m=new MIE();
	      m.Adisplay();
	      m.Bdisplay();
		

	}

}
