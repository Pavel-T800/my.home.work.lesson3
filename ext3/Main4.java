package ext3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        int sumFirst = 0;
        int sumSecond = 0;

//        System.out.println("Enter the size for the first array");
        Scanner scan1 = new Scanner(System.in);
        int array1 = 5;                   //scan1.nextInt();

        Random random1 = new Random();
        int[] myArray1 = new int[array1];

        for (int i = 0; i < array1; i++) {
            myArray1[i] = random1.nextInt(100);
            sumFirst += myArray1[i];
        }

//        System.out.println("Enter the size for the second array ");
        Scanner scan2 = new Scanner(System.in);
        int array2 = 5;                 //scan2.nextInt();

        Random random2 = new Random();
        int[] myArray2 = new int[array2];

        for (int j = 0; j < array2; j++) {
            myArray2[j] = random2.nextInt(100);
            sumSecond += myArray2[j];
        }
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        if (sumFirst > sumSecond) {
            System.out.println("The sum of the first array is bigger than second one.");
            System.out.println(sumFirst + " > " + sumSecond);

        } else if (sumFirst == sumSecond) {
            System.out.println("The sum of the first array is equal to the second one.");
            System.out.println(sumFirst + " = " + sumSecond);

        } else {
            System.out.println("The sum of the first array is less than the second one.");
            System.out.println(sumFirst + " < " + sumSecond);
        }
    }
}
