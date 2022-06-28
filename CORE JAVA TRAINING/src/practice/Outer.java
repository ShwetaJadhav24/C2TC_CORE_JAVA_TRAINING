package practice;

public class Outer {
	
	static int x=10;
	         static class inner
	         {
	        	 public void method_demo()
	        	 {
	        		 System.out.println("I am inner class");
	        		 x=100;
	        		 System.out.println(x);
	        	 }
	         }

	public static void main(String[] args) {
		Outer.inner obj=new Outer.inner();
		obj.method_demo();
		
		

	}

}
