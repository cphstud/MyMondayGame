import java.util.Scanner;

public class UI {
    Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);
    }

    public String getUserAnswer() {
        String msg="";
        msg=scanner.nextLine();
        return msg;
    }

    public void getUserMenuItem(int item) {
        // TODO: brug switch på item
        System.out.println("Indtast navn");
    }

    public int getUserAnswerInt() {
        int msg=0;
        msg=scanner.nextInt();
        return msg;
    }
}
