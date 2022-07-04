package com.bank.framework;

public class BankAcc {
	
	protected static int accNo;
	protected static String accNm;
	protected float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal)
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		
	}
	
	public int getaccNo()
	{
	   return accNo;	
	}
	
	public void setaccNo(int accNo) {
		this.accNo = accNo;
	}
	 
	public float getaccBal()
	{
		return accBal;
	}
	
	public void setaccBal()
	{
		this.accBal = accBal;
	}
	public String getaccNm()
	{
		return accNm;
	}
	
	public void setaccNm(String accNm)
	{
		this.accNm = accNm;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Withdraw amount");
	}
	
	public void deposite(float accBal)
	{
		System.out.println("Deposite amount");
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	

}
