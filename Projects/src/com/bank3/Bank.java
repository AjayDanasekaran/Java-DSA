package com.bank3;

public interface Bank {
	int balance();
	void transfer(String bank,int amt);
}
class SBIBank implements Bank{
	private static SBIBank instance;
	ICICIBank i;
	HDFCBank h;
	private static int balance = 10000;
	
	private SBIBank() {
    
    }
	
	public static SBIBank getInstance() {
        if (instance == null) {
            instance = new SBIBank();
        }
        return instance;
    }
	
	public int getBalance() {
		return balance;
	}
	
	public static void setBalance(int balance) {
		SBIBank.balance = balance;
	}
	
	@Override
	public int balance() {
		return getBalance();
	}
	
	@Override
	public void transfer(String bank,int amt) {
		if(bank.equals("ICICIBank") && amt<=balance) {
			i = ICICIBank.getInstance();
			setBalance(SBIBank.balance-amt);
		 	i.setBalance(i.getBalance()+amt);
		}
		else if(bank.equals("HDFCBank") && amt<=balance) {
			h = HDFCBank.getInstance();
			setBalance(SBIBank.balance-amt);
		 	h.setBalance(h.getBalance()+amt);
		}
		else {
			System.out.println("Transfer is greater than balance");
		}
	}
}
class ICICIBank implements Bank{
	private static ICICIBank instance;
	SBIBank s;
	HDFCBank h;
	private static int balance = 30000;
	
	public int getBalance() {
		return balance;
	}
	
	private ICICIBank() {
	    
    }
	
	public static ICICIBank getInstance() {
        if (instance == null) {
            instance = new ICICIBank();
        }
        return instance;
    }
	
	public static void setBalance(int balance) {
		ICICIBank.balance = balance;
	}

	@Override
	public int balance() {
		return getBalance();
	}
	
	@Override
	public void transfer(String bank,int amt) {
		if(bank.equals("SBIBank") && amt<=balance) {
			s = SBIBank.getInstance();
			setBalance(ICICIBank.balance-amt);
		 	s.setBalance(s.getBalance()+amt);
		}
		else if(bank.equals("HDFCBank") && amt<=balance) {
			h = HDFCBank.getInstance();
			setBalance(ICICIBank.balance-amt);
		 	h.setBalance(h.getBalance()+amt);
		}
		else {
			System.out.println("Transfer is greater than balance");
		}
	}
}
class HDFCBank implements Bank{
	private static HDFCBank instance;
	SBIBank s;
	ICICIBank i;
	private static int balance = 50000;
	
	private HDFCBank() {
	    
    }
	
	public static HDFCBank getInstance() {
        if (instance == null) {
            instance = new HDFCBank();
        }
        return instance;
    }
	
	public int getBalance() {
		return balance;
	}
	public static void setBalance(int balance) {
		HDFCBank.balance = balance;
	}
	
	@Override
	public int balance() {
		return getBalance();
	}
	
	@Override
	public void transfer(String bank,int amt) {
		if(bank.equals("SBIBank") && amt<=balance) {
			s = SBIBank.getInstance();
			setBalance(HDFCBank.balance-amt);
		 	s.setBalance(s.getBalance()+amt);
		}
		else if(bank.equals("ICICIBank") && amt<=balance) {
			i = ICICIBank.getInstance();
			setBalance(HDFCBank.balance-amt);
		 	i.setBalance(i.getBalance()+amt);
		}
		else {
			System.out.println("Transfer is greater than balance");
		}
	}
	
}