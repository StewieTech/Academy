package com.bptn.course.week2;

public class SavingsAccount extends Account {
	   

    //declare instance variable
    double interest ;

    //add parameterized constructor - use super keyword to call parent constructor
    public SavingsAccount(String name, double balance, double interest) {
        super(name, balance);
        this.interest = interest;
    }



    //override the toString method
    public String toString() {
        return super.toString() + ", " + interest ;
    }

    public boolean equals(SavingsAccount firstAccount) {
    	SavingsAccount secondAccount = (SavingsAccount) firstAccount ;
        return (super.equals(firstAccount))  &&  (this.interest == secondAccount.interest);
//        return (this.balance == secondAccount.balance) && (this.balance == secondAccount.balance);
//        return (this.balance == secondAccount.balance) ;
    // firstAccount.name(equals(secondAccount.name));
    // firstAccount.name(equals(secondAccount));
}

    //override the equals method
    // public boolean equals(Account firstAccount, Account secondAccount) {
    //     firstAccount.equals(secondAccount);
    //     firstAccount.equals(secondAccount);
    // }
    
}
