import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int vriantsOfGift = 0;

        System.out.println("Input wight of gift");
        Scanner scGift = new Scanner(System.in);
        int gift = scGift.nextInt();

        System.out.println("Input wight of orange");
        Scanner scOrange = new Scanner(System.in);
        int orange = scOrange.nextInt();
        int endOrange = gift/orange;

        System.out.println("Input wight of apple");
        Scanner scApple = new Scanner(System.in);
        int apple = scApple.nextInt();
        int endApple = gift/apple;

        System.out.println("Input wight of pale");
        Scanner scPale = new Scanner(System.in);
        int pale = scPale.nextInt();
        int endPale = gift/pale;

        for (int o = 0; o <= endOrange; o++){
            for (int a = 0; a <= endApple; a++){
                for (int p = 0; p <= endPale; p++){
                    if (o*orange + a*apple + p*pale == gift){
                        vriantsOfGift++;
                    }
                }
            }
        }
        System.out.println("Amount variants of gift: " + vriantsOfGift);
    }
}
