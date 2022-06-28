package com.tns.assignment;

public class IfElse3 {

	public static void main(String[] args) {
		
		int x = 5;

		
		 if (x == 5)  // 5== 5 -> yes then if will enter to if block
{ 
		     if (x >= 5)   //  5>=5 yes
		     {
		      	System.out.println("X is greater than 5");   // x is greater than 5  will print
		     }
		      else 
		        {
		         System.out.println("X is smaller than 5"); 
		         } 
}
		
		if(x == 5)  // 5==5 yes
		{
			System.out.println("X equals to 5");  // this will print
		}
		else if(x > 5)
	     	{
			System.out.println("X is greater to 5");		
	     	}
		else 
		  {
			System.out.println("X is smaller than 5");
		  }


	}

}
