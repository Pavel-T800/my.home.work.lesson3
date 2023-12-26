//метод сортировки пузырьком

package ext7;
import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        int[] myArray = new int[]{4, 14, 13, 18, 10, 14, 13, 11, 11, 1, 8, 3, 18, 14, 13, 13, 15, 17, 6, 1};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int swap = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = swap;
                }
            }
            System.out.println(Arrays.toString(myArray));
        }
    }
}
