package com.bank.framework;

public class SavingAcc extends BankAcc 
{
	public static boolean isSalaried=true;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.setSalaried(isSalaried);
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Saving acoount balance is:" + accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried() + ", accNo=" + getaccNo() + ", accNm=" + getaccNm() + ", accBal=" + getaccBal()
				+ ", toString()+" + super.toString() + ", getClass()= " + getClass() + ", hashCode()=" + hashCode() +"]";
	}
	
	public boolean isSalaried()
	{
		return isSalaried;
	}
	
	public void setSalaried(boolean isSalaried)
	{
		SavingAcc.isSalaried = isSalaried;
	}
	
	

}
