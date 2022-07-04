package com.bank.application;

import com.bank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float accBal=0;
	
	public float getaccBal()
	{
		return accBal;
	}
	
	public MMSavingAcc(int i, String string, float f, boolean b)
	{
		super(accNo, accNm, accBal, isSalaried);
	}
	
	public void withdraw(float accBal)
	
	{
		System.out.println("Saving account balance is:" + accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc []";
	}
	
	

}
