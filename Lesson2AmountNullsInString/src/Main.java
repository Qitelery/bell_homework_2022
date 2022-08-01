import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(countNulls());
    }

    public static int countNulls() {
        System.out.println("Input string:");
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        String subString = "0";
        int start;
        if (!numbers.contains(subString)) {
            return 0;
        } else {
            for (start = 1; start < numbers.length(); start++) {
                if (numbers.contains(subString)) {
                    subString = "0";
                    subString = subString.repeat(start + 1);
                } else {
                    return start-1;
                }
            }
        }
        return start-1;
    }
}
