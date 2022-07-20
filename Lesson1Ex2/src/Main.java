import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Please insert the ticket number");
        Scanner sc = new Scanner(System.in);
        int Ticket = sc.nextInt();
        if (Ticket < 100000 | Ticket > 999999){
            System.out.println("Don't bulling program!");
        }else {
            int number1 = Ticket / 100000;
            int number2 = (Ticket % 100000) / 10000;
            int number3 = (Ticket % 10000) / 1000;
            int number4 = (Ticket % 1000) / 100;
            int number5 = (Ticket % 100) / 10;
            int number6 = Ticket % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                System.out.println("Happy ticket!");
            } else {
                System.out.println("Unhappy ticket:(");
            }
        }
    }
}
