package bankAcc;

import java.sql.SQLOutput;

public class bankMain {
    public static void main(String[] args) {
        // Create the first account owner
        Person firstPerson = new Person(12345, "Adam", "Garden");

        // Create a bank account with the first owner, a limit of 3 account owners, and an initial balance of $10000.
        bankAccount account = new bankAccount(firstPerson, 3, 10000.0);

        // Print the first person details
        System.out.println(firstPerson);

        // Add additional account owners
        account.addAccountOwner(56789, "Eve", "Garden");
        account.addAccountOwner(42684, "Clink", "Garden");
        account.addAccountOwner(42684, "Brave", "Garden");

        // Print the account details
        System.out.println(account);


    }
}
