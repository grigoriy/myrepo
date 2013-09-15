import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name: ");
        String inp = scan.nextLine();
        System.out.println("Hello, " + inp);
        Scanner.close();
    }
}
