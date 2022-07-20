import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int resault;

        System.out.println("Input first number:");
        Scanner first = new Scanner(System.in);
        int firstNumber = first.nextInt();

        System.out.println("Input first number:");
        Scanner second = new Scanner(System.in);
        int secondNumber = second.nextInt();

        System.out.println("Input operation:");
        Scanner operator = new Scanner(System.in);
        String operation = operator.nextLine();

        switch (operation){
            case "+":
                resault = firstNumber + secondNumber;
                System.out.println(resault);
                break;
            case "-":
                resault = firstNumber - secondNumber;
                System.out.println(resault);
                break;
            case "*":
                resault = firstNumber * secondNumber;
                System.out.println(resault);
                break;
            case "/":
                if (secondNumber == 0){
                    System.out.println("Don't bulling program");
                    break;
                }else {
                    resault = firstNumber / secondNumber;
                    System.out.println(resault);
                    break;
                }
        }
    }
}
