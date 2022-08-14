import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        bubbleSort(inputArray());
    }

    public static int[] inputArray(){
        System.out.println("Input a length of array:");
        Scanner sc = new Scanner(System.in);
        int lengthArray = sc.nextInt();
        int array[] = new int[lengthArray];
        for(int i = 0; i < lengthArray; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + "  ");
        }

        return array;
    }

    public static void bubbleSort(int[] array){
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        System.out.println("\n" + Arrays.toString(array));
    }
}
