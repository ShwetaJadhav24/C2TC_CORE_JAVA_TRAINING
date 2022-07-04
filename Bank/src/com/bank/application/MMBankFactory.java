package com.bank.application;

import com.bank.framework.SavingAcc;
import com.bank.framework.CurrentAcc;
import com.bank.framework.BankAcc;
import com.bank.framework.BankFactory;


public class MMBankFactory implements BankFactory {

	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return mmcurrent;
	}

	
}
