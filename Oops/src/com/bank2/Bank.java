package com.bank2;

public interface Bank {
    int balance();

    void transfer(String bank, int amt);
}

abstract class BankBase implements Bank {
    private int balance;
    private String bankName;

    public BankBase(String bankName, int initialBalance) {
        this.bankName = bankName;
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public int balance() {
        return getBalance();
    }

    @Override
    public void transfer(String bank, int amt) {
        System.out.println("Invalid transfer");
    }
}

class SBIBank extends BankBase {
    private static SBIBank instance;

    private SBIBank() {
        super("SBIBank", 10000);
    }

    public static SBIBank getInstance() {
        if (instance == null) {
            instance = new SBIBank();
        }
        return instance;
    }

    @Override
    public void transfer(String bank, int amt) {
        if (bank.equals("ICICIBank")) {
            ICICIBank i = ICICIBank.getInstance();
            if (amt <= balance()) {
                setBalance(balance() - amt);
                i.setBalance(i.balance() + amt);
                System.out.println("Transfer successful.");
                System.out.println("SBIBank Balance: " + balance());
                System.out.println("ICICIBank Balance: " + i.balance());
            } else {
                System.out.println("Transfer is greater than balance.");
            }
        } else if (bank.equals("HDFCBank")) {
            HDFCBank h = HDFCBank.getInstance();
            if (amt <= balance()) {
                setBalance(balance() - amt);
                h.setBalance(h.balance() + amt);
                System.out.println("Transfer successful.");
                System.out.println("SBIBank Balance: " + balance());
                System.out.println("HDFCBank Balance: " + h.balance());
            } else {
                System.out.println("Transfer is greater than balance.");
            }
        } else {
            super.transfer(bank, amt);
        }
    }
}

class ICICIBank extends BankBase {
    private static ICICIBank instance;

    private ICICIBank() {
        super("ICICIBank", 30000);
    }

    public static ICICIBank getInstance() {
        if (instance == null) {
            instance = new ICICIBank();
        }
        return instance;
    }

    @Override
    public void transfer(String bank, int amt) {
        if (bank.equals("SBIBank")) {
            SBIBank s = SBIBank.getInstance();
            if (amt <= balance()) {
                setBalance(balance() - amt);
                s.setBalance(s.balance() + amt);
                System.out.println("Transfer successful.");
                System.out.println("ICICIBank Balance: " + balance());
                System.out.println("SBIBank Balance: " + s.balance());
            } else {
                System.out.println("Transfer is greater than balance.");
            }
        } else if (bank.equals("HDFCBank")) {
            HDFCBank h = HDFCBank.getInstance();
            if (amt <= balance()) {
                setBalance(balance() - amt);
                h.setBalance(h.balance() + amt);
                System.out.println("Transfer successful.");
                System.out.println("ICICIBank Balance: " + balance());
                System.out.println("HDFCBank Balance: " + h.balance());
            } else {
                System.out.println("Transfer is greater than balance.");
            }
        } else {
            super.transfer(bank, amt);
        }
    }
}

class HDFCBank extends BankBase {
    private static HDFCBank instance;

    private HDFCBank() {
        super("HDFCBank", 50000);
    }

    public static HDFCBank getInstance() {
        if (instance == null) {
            instance = new HDFCBank();
        }
        return instance;
    }

    @Override
    public void transfer(String bank, int amt) {
        if (bank.equals("SBIBank")) {
            SBIBank s = SBIBank.getInstance();
            if (amt <= balance()) {
                setBalance(balance() - amt);
                s.setBalance(s.balance() + amt);
                System.out.println("Transfer successful.");
                System.out.println("HDFCBank Balance: " + balance());
                System.out.println("SBIBank Balance: " + s.balance());
            } else {
                System.out.println("Transfer is greater than balance.");
            }
        } else if (bank.equals("ICICIBank")) {
            ICICIBank i = ICICIBank.getInstance();
            if (amt <= balance()) {
                setBalance(balance() - amt);
                i.setBalance(i.balance() + amt);
                System.out.println("Transfer successful.");
                System.out.println("HDFCBank Balance: " + balance());
                System.out.println("ICICIBank Balance: " + i.balance());
            } else {
                System.out.println("Transfer is greater than balance.");
            }
        } else {
            super.transfer(bank, amt);
        }
    }
}


