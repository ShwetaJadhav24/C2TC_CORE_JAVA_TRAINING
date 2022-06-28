package practice;

public class Method_Overloading {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.m();
		t.m(56);
		t.m(67.87);
		t.m('a');
		
	}

}

class Test

{

public void m()
{
	System.out.println("No Arguments");
}

public void m(int i)
{
	System.out.println("Integer Arguments");
}

public void m(double d)
{
	System.out.println("Double Arguments");
}

}