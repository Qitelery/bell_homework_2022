import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws IOException {
        System.out.println("Input a size of array:");
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        reverseArray(inputArray(sizeArray), sizeArray);
    }

    public static String inputArray(int sizeArray) throws IOException {

        System.out.println("Input name of file with an array:");
        Scanner name = new Scanner(System.in);
        String nameFile = name.nextLine();
        String pathFile = "src/" + nameFile + ".txt";
        FileWriter writer = new FileWriter(pathFile);

        int number;
        Scanner sc = new Scanner(System.in);

        for (int start = 0; start < sizeArray; start++){
            System.out.println("Input a digit №" + (start + 1) + ":");
            number = sc.nextInt();
            writer.write(Integer.toString(number));
            if (start != sizeArray){
                writer.write(" ");
            }
        }
        writer.close();
        return pathFile;
    }

    public static void reverseArray(String pathFile, int sizeArray) throws IOException {
        FileReader reader = new FileReader(pathFile);
        Scanner scanner = new Scanner(reader);
        int[] array = new int[sizeArray];
        for (int start = sizeArray - 1; start > -1; start--){
            array[start] = scanner.nextInt();
        }

        for (int start = 0; start < sizeArray; start++){
            System.out.println(array[start]);
            if (start != array.length - 1){
                System.out.println(" ");
            }
        }
        reader.close();

    }
}
