package package_1;

    public class BankAccount {
        private  int accountNumber=0;
        private AccountType accountType;
        double balance=0;

        public BankAccount( int accountNumber,AccountType accountType, double balance) {
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public AccountType getAccountType() {
            return accountType;
        }

        public void setAccountType(AccountType accountType) {
            this.accountType = accountType;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public String toString(){
            return String.format("%d,%s,%f",accountNumber,accountType,balance);
        }
    }


