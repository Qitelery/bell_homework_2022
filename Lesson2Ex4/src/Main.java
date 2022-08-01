import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        repeatNulls();
    }

    public static void repeatNulls(){
        String stringNull = "0";
        System.out.println("Input amount nulls:");
        Scanner sc = new Scanner(System.in);
        int Nulls = sc.nextInt();
        System.out.println(stringNull.repeat(Nulls));
    }
}