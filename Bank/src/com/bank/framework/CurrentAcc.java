package com.bank.framework;

public class CurrentAcc extends BankAcc {
	
	protected static float creditLimit=5000;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal);
		CurrentAcc.creditLimit = creditLimit;
	}
	
	public void withdraw(float creditLimit)
	{
		System.out.println("Credit limit is:"+creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo" + getaccNo() + ", accNm=" + ", accBal="
	                         + getaccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashcode()" + hashCode() + "]";
	}
	
	public static float getcreditLimit()
	{
		return creditLimit;
	}
	
	

}
