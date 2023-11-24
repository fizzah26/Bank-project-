package package_1;

public class Bank implements BankFunctions {
    private BankAccount[] account = new BankAccount[1000];
    private AccountHolder[] accountHolder = new AccountHolder[1000];

    int c = 1;


    public void createAccount(BankAccount accounts, AccountHolder accountHolders) {
        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = accounts;
                accountHolder[i] = accountHolders;
                c++;
                System.out.println("Account created successfully");
                return;
            }
        }
    }

    public void depositCash(int accountNumber, double amount) {
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null && account[i].getAccountNumber() == accountNumber) {
                account[i].setBalance(account[i].getBalance() + amount);
                System.out.println("Cash deposited successfully");
                return;
            }
        }
        System.out.println("Account not found!!");
    }

    public void withdrawCash(int accountNumber, double amount) {
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null && account[i].getAccountNumber() == accountNumber) {
                if (amount <= account[i].getBalance()) {
                    account[i].setBalance(account[i].getBalance() - amount);
                    System.out.println("cash withdrawed successfully");
                } else
                    System.out.println("insufficient Balance!!");
                return;
            }
        }
        System.out.println("Account not found!!");
    }

    public void displayAccountInfo(int accountNumber) {
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null && account[i].getAccountNumber() == accountNumber) {
                System.out.println("Account Information:");
                System.out.println("Account Number: " + account[i].getAccountNumber());
                System.out.println("Account Type: " + account[i].getAccountType());
                System.out.println("Balance: " + account[i].getBalance());
                System.out.println("\nAccount Holder Information:");
                System.out.println("Name: " + accountHolder[i].getName());
                System.out.println("Address: " + accountHolder[i].getAddress());
                System.out.println("Phone Number: " + accountHolder[i].getPhoneNumber());
                return;
            }
        }
    }
}
