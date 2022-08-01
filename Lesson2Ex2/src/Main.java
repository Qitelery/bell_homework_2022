import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Input word or number:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (polindrom(word, reverseWord(word))){
            System.out.println("Word or number is polindrom");
        } else {
            System.out.println("Word or number is not polindrom");
        }
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
    public static boolean polindrom(String word, String reverseWord){
        return word.equals(reverseWord);
    }
}
