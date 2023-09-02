package bankAcc;

import java.util.Arrays;

public class bankAccount {
    private long accountId;
    private Person[] accountOwners;
    private double balance;
    private int accountOwnerCounting = 1;

    public bankAccount(Person firstPersonForAccountOwner,int numberOfAccountOwner, double balance){
        this.accountOwners = new Person[numberOfAccountOwner];
        this.accountOwners[0] = firstPersonForAccountOwner;
//        this.accountOwnerCounting = accountOwnerCounting;
        this.balance = balance;
    }
    public boolean addAccountOwner(long idCard, String newFirstName, String newLastName) {
        if (accountOwnerCounting >= accountOwners.length) {
            System.out.println("Maximum number of account owners reached.");
            return false;
        } else {
            accountOwners[accountOwnerCounting] = new Person(idCard, newFirstName, newLastName);
            accountOwnerCounting++;
            System.out.println("Account owner added successfully.");
            return true;
        }
    }

    public long getAccountId() {
        return accountId;
    }

    public Person[] getAccountOwners() {
        return accountOwners;
    }

    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }
    public boolean deposit(double amount){
        if(amount>0){
            balance += amount;
            return true;
        }else{
            return false;
        }
    }
    public boolean transfer(bankAccount targetAccount, double amount){
        if(amount<=balance){
            this.withdraw(amount);
            targetAccount.deposit(amount);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accountId=" + accountId +
                ", accountOwners=" + "\n" +Arrays.toString(accountOwners) +
                ", balance=" + balance + '}';
    }
}
