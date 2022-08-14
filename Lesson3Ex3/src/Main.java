import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a searched number:");
        int number = sc.nextInt();

        System.out.println("Input size of array:");
        int sizeArray = sc.nextInt();

        search(inputArray(sizeArray), number);
    }

    public static int[] inputArray(int sizeArray){
        int[] array = new int[sizeArray];
        Scanner sc = new Scanner(System.in);

        for (int start = 0; start < sizeArray; start++){
            System.out.println("Input a digit №" + (start + 1) + ":");
            array[start] = sc.nextInt();
        }
        return array;

    }

    public static void search(int[] array, int number){
        int lowIndex = 0;
        int highIndex = array.length-1;

        int count = 0;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (number == array[midIndex]) {
                count = 1;
                break;
            } else if (number < array[midIndex]) {
                highIndex = midIndex-1;
            } else if (number > array[midIndex]) {
                lowIndex = midIndex+1;
            }
        }
        if (count == 1){
            System.out.println("There is the number in the array");
        } else {
            System.out.println("There is no the number in the array or you inputed unsorted array");
        };
    }
}
