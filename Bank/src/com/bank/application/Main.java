package com.bank.application;

import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingAcc;
import com.bank.framework.BankFactory;
import com.bank.framework.BankAcc;
import com.bank.application.MMBankFactory;
import com.bank.application.MMSavingAcc;
import com.bank.application.MMCurrentAcc;

public class Main {

	public static void main(String[] args) {
		
		BankFactory mmbankfact = new MMBankFactory();
		mmbankfact.getNewSavingAcc(123, "Saving_account_name", 205488, true);
		mmbankfact.getNewCurrentAcc(345, "Current_account_name", 520002, 5000);
		
		SavingAcc mmsavingAcc = new MMSavingAcc(0, null, 0, false);
		mmsavingAcc.getaccNm();
		mmsavingAcc.getaccNo();
		mmsavingAcc.getaccBal();
		
		mmsavingAcc.withdraw(205488);
		
		mmsavingAcc.toString();
		
		CurrentAcc mmcurrentAcc = new MMCurrentAcc(0);
		
		mmcurrentAcc.getaccNm();
		mmcurrentAcc.getaccNo();
		mmcurrentAcc.getaccBal();
		
		mmcurrentAcc.withdraw(520002);
		
		mmcurrentAcc.toString();
		
		
		
		
		
		

	}

}
