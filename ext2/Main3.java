package ext2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();


        Random random = new Random();
        int[] myArray = new int[size];

        int min = myArray[0];
        int max = myArray[0];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
            sum += myArray[i];
            count++;
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        double sumdouble = sum;
        double countdouble = count;
        double avg = sumdouble / countdouble;
        System.out.println(Arrays.toString(myArray));
        System.out.println("The min value of the array - " + min);
        System.out.println("The average value of the array - " + avg);
        System.out.println("The max value of the array - " + max);

    }
}


