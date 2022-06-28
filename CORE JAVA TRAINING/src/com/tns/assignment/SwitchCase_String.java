package com.tns.assignment;

public class SwitchCase_String {

	public static void main(String[] args) {
		
		java.lang.String name = "te";

		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("Vikas");
			break;
			
		case "team":
			System.out.println("Team Java Full Stack");
			break;
			
		case "te":
			System.out.println("Vishnu & Krishna");
			break;
			
		default:
			System.out.println("Invalid entry");
			break;
		}

	}

}
