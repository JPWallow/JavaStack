public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount baxterBankAccount = new BankAccount();
        baxterBankAccount.depositMoney(600, "checking");
        baxterBankAccount.depositMoney(1000, "savings");
        baxterBankAccount.withdrawlMoney(250, "checking");
        baxterBankAccount.withdrawlMoney(450, "savings");

        BankAccount bootsBankAccount = new BankAccount();
        bootsBankAccount.depositMoney(750, "checking");
        bootsBankAccount.depositMoney(225, "savings");
        bootsBankAccount.withdrawlMoney(800, "checking");
        bootsBankAccount.withdrawlMoney(75, "savings");

        BankAccount oliverBankAccount = new BankAccount();
        oliverBankAccount.depositMoney(800, "checking");
        oliverBankAccount.depositMoney(100, "savings");
        oliverBankAccount.withdrawlMoney(250, "checking");
        oliverBankAccount.withdrawlMoney(150, "savings");

        System.out.println("----- Baxter Account Information -----");
        System.out.println("Checking Account: " + baxterBankAccount.getCheckingBalance());
        System.out.println("Savings Account: " + baxterBankAccount.getSavingsBalance());
        System.out.println("Account Total: " + baxterBankAccount.getAccountBalance());

        System.out.println("----- Boots Account Information -----");
        System.out.println("Checking Account: " + bootsBankAccount.getCheckingBalance());
        System.out.println("Savings Account: " + bootsBankAccount.getSavingsBalance());
        System.out.println("Account Total: " + bootsBankAccount.getAccountBalance());

        System.out.println("----- Oliver Account Information -----");
        System.out.println("Checking Account: " + oliverBankAccount.getCheckingBalance());
        System.out.println("Savings Account: " + oliverBankAccount.getSavingsBalance());
        System.out.println("Account Total: " + oliverBankAccount.getAccountBalance());

        System.out.println("----- Total Bank Data -----");
        System.out.println("Total Money Stored: " + BankAccount.totalMoneyStored);
        System.out.println("Number of Accounts: " + BankAccount.numberOfAccounts);
    }
}
