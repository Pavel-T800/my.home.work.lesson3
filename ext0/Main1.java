package ext0;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Enter your number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int toFind = num;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == toFind) {
                System.out.println("The number included in the array");
                return;
            }
        }
        System.out.println("There is no such number in the array. Please enter another number.");
    }
}




