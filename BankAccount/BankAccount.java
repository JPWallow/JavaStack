class BankAccount {

    private double checkingBalance;
    private double savingsBalance;

    public static int numberOfAccounts = 0;
    public static double totalMoneyStored = 0;

    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public double getAccountBalance() {
        return (this.checkingBalance + this.savingsBalance);
    }

    public void depositMoney(double depositAmount, String account) {
        if (account == "checking") {
            this.checkingBalance += depositAmount;
        } else {
            this.savingsBalance += depositAmount;
        }

        this.totalMoneyStored += depositAmount;
    }

    public void withdrawlMoney(double withdrawlAmount, String account) {
        if (account == "checking") {
            if (this.checkingBalance < withdrawlAmount) {
                System.out.println("Insufficient Funds");
            } else {
                this.checkingBalance -= withdrawlAmount;
            }
        } else {
            if (this.savingsBalance < withdrawlAmount) {
                System.out.println("Insufficient Funds");
            } else {
                this.savingsBalance -= withdrawlAmount;
            }
        }

        this.totalMoneyStored -= withdrawlAmount;
    }
}
