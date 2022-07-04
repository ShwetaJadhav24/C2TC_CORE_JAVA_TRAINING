package com.bank.application;

import com.bank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal, creditLimit);
	}	
	
	 public MMCurrentAcc(float accBal)
	 {
	 	super(accNo, accNm, accBal, creditLimit);
	 }
	 
	 public void withdraw(float accBal)
	 
	 {
		
		 	System.out.println("Current account balance is:" + accBal);

	 }

	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + getaccNo() + ", accBal=" + getaccBal() + ", toString()=" + super.toString()
		+ ", getaccNm()=" + getaccNm() + ", getclass()= " + getClass() + ", hashCode()=" + hashCode() + "]";
	} 

	 



     
}
