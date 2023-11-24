package package_1;
import java.util.Scanner;
import java.util.ArrayList;

public class BankSystem {
    public static void main(String[] args) {
        /*Bank bank = new Bank();
        AccountHolder a1 = new AccountHolder("sara", "iqbal Town", "20974538");
        BankAccount b1 = new BankAccount(1, AccountType.SAVING, 50);
        AccountHolder a2 = new AccountHolder("dania", "Johar Town", "042946739");
        BankAccount b2 = new BankAccount(2, AccountType.CURRENT, 100);
        AccountHolder a3 = new AccountHolder("sana", "wapda Town", "17649324");
        BankAccount b3 = new BankAccount(3, AccountType.SAVING, 290);
        bank.createAccount(b1, a1);
        bank.createAccount(b2, a2);
        bank.createAccount(b3,a3);

        bank.depositCash(1, 30);
        bank.withdrawCash(2, 150);
        bank.displayAccountInfo(b1.getAccountNumber());*/
        System.out.println("choose an option");
        Scanner sc = new Scanner(System.in);
        System.out.println("1-create new bankaccount");
        int option=sc.nextInt();
        if (option==1) {
            ArrayList<BankAccount> newAccount = new ArrayList<>();
            System.out.println("enter number of accounts to add");
            int numbaccount = sc.nextInt();
            for (int i = 0; i < numbaccount; i++) {
                System.out.println("enter account number");
                int accountNumber = sc.nextInt();
                System.out.println("Enter account type");
                AccountType accountType = null;
             /*   try {
                    String accountTypes = sc.next();
                    accountType = AccountType.valueOf(accountTypes);
                } catch (IllegalArgumentException e) {
                    System.out.println("invalid input enter in capital letters");
                    sc.nextLine();
                    i--;
                    continue;
                }*/
                System.out.println("enter balance");
                double balance = sc.nextDouble();
                BankAccount account = new BankAccount(accountNumber, accountType, balance);
                newAccount.add(account);
            }
            System.out.println("list of bankaccounts: ");
            for (BankAccount element : newAccount) {
                System.out.println(element);
            }
        }else{
            System.out.println("incorect option selected");
        }
    }

}


