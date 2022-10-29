public class BankAccount {
    String account = "112191237181";
    String balance = "$199,2939,210";

    public static void main(String[] args) {
        CheckingAccount checkingAcc = new CheckingAccount();
        SavingsAccount savingsAcc = new SavingsAccount();
        COD cod = new COD();

        System.out.println(savingsAcc.balance);
    }
}
