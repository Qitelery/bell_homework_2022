import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Input a ticket number:");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        if (number.length()%2 == 0) {
            checkTicket(number);
        } else {
            System.out.println("Ticket is not happy:(");        }
    }

    public static void checkTicket(String number){
        int sum = 0;
        int start = 0;
        int step = 1;
        int end = number.length()/2;
        for (int index = start; index < end; index+=step){
            sum += number.charAt(index) - number.charAt(end + index);
        }
        if (sum == 0){
            System.out.println("Ticket is happy!:))");
        } else {
            System.out.println("Ticket is not happy:(");
        }
    }
}
