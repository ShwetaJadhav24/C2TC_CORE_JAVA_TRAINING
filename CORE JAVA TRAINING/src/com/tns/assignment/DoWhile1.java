package com.tns.assignment;

public class DoWhile1 {

	public static void main(String[] args) {
		
		// for loop
		  System.out.println("Forloop"); 
		  for(int i=1,j=1,z=1; i<10||j<10||z<10;i++,j++,z++) 
		  { 
			  j++;
			  
			  System.out.println("i="  +i   +  " and j="+j +"and Z=" +z); 
			 			  
		  }


		  // while loop 
		  System.out.println("while loop"); 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
	       //Do while loop
			int i1 = 1, j1 = 1;
			  System.out.println("Do While loop"); 
			do {
				i1++;
				j1++;
				System.out.println("i=" + i1 + " and j=" + j1);
			    } 
			while (i1 < 10 || j1 < 10);


	}

}
