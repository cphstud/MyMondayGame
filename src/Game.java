public class Game {

    public void runGame() {
        BankAccount ba1 = new BankAccount("Kurt");
        BankAccount ba2 = new BankAccount("Verner");
        BankAccount ba3 = new BankAccount("Lone");

        ba1.setBalance(200000);
        ba2.setBalance(200000);
        ba3.setBalance(200000);
        System.out.println(ba1);

    }
}
