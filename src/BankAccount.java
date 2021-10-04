public class BankAccount {
    private String name;
    private int balance;

    public BankAccount(String name) {
        this.name=name;
    }

    public void setBalance(int startAmount) {
        this.balance=startAmount;
    }

    public int withDraw(int amount) {
        balance=balance-amount;
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        String msg="";
        msg=name+" bal: "+ balance;
        return msg;
    }

}
