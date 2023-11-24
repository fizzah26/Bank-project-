package package_1;

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
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
        bank.displayAccountInfo(b1.getAccountNumber());
    }

    //hello world
}

