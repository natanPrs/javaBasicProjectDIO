import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int number = scan.nextInt();
        System.out.println("Please enter the Agency number");
        String agency = scan.next();
        System.out.println("Please, type your name");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Please enter your balance");
        String balanceStr = scan.next();
        float balance = Float.parseFloat(balanceStr);


        System.out.println("Hello " + name + ", congratulations on opening your account in our bank! Your agency is: " + agency + ", account: " + number + ", and your balance is: " + balance + " is available!");


    }


}
