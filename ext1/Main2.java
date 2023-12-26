//сумма всех нечетных мест массива

package ext1;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] myArray = new int[]{10, 33, 31, 27, 40, 15, 35, 49, 21, 32, 13, 45, 35, 30, 39, 49, 34, 41, 40, 35};

        System.out.println("Enter your number that you want to change to '-1'");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int toFind = num;
        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == toFind) {
                myArray[i] = -1;
                count++;
            }
        }
        if (count > 0) {
            if (count == 1) {
                System.out.println("The number " + toFind + " was changed " + count + " time");
                System.out.println("The new array " + Arrays.toString(myArray));
            } else {
                System.out.println("The number " + toFind + " were changed " + count + " times");
                System.out.println("The new array " + Arrays.toString(myArray));
            }
        } else {
            System.out.println("There are no such numbers in the array. Please enter another number.");
        }
    }
}


//        int[] text = new int[]{25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
//        int sum = 0;
//        for (int i = 1; i < text.length; i += 2) {
//        sum += text[i];
//        System.out.println(text[i]);
//        }
//        System.out.println(sum);