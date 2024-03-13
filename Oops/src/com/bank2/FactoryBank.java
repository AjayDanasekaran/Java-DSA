package com.bank2;

public class FactoryBank {
	public static Bank getBank(String bankName) {
		Bank b;
        if (bankName.equals("SBIBank")) {
            b =  SBIBank.getInstance();
        } else if (bankName.equals("HDFCBank")) {
        	b =  HDFCBank.getInstance();
        } else if (bankName.equals("ICICIBank")) {
        	b = ICICIBank.getInstance();
        } else {
            b = null;
        }
        return b;
    }
}
