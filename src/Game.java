import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner scanner;
    List<BankAccount> bankAccounts;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void runGame() {
        BankAccount ba1 = new BankAccount("Kurt");
        BankAccount ba2 = new BankAccount("Verner");
        BankAccount ba3 = new BankAccount("Lone");

        ba1.setBalance(200000);
        ba2.setBalance(200000);
        ba3.setBalance(200000);
        System.out.println(ba1);

        int counter=0;
        int numberOfAccounts=3;
        String userInput="";

        while(counter < numberOfAccounts) {

            System.out.println("Indtast navn");
            userInput=scanner.nextLine();
            BankAccount ba = new BankAccount(userInput);
            bankAccounts.add(ba);
            counter++;
        }









        // Brugerinteraktion


    }
}
