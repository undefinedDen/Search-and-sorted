package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{1, 6, 9, 1, 78, 14, 4, 7, 98, 6, 7, 5, 3, 4, 14};

        System.out.println("Initial array: " + "\n" + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        System.out.println("Sorted array: " + "\n" + Arrays.toString(array));

        System.out.print("Enter number to find it in array: ");
        int number = scanner.nextInt();
        int low = 0;
        int high = array.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == number) {
                index = mid;
                break;
            } else if (array[mid] < number){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        System.out.println("-----------------------------------------------------------------");
        if(index == -1){
            System.out.println("Value " + number + " is absent, please enter another number!!");
        } else{
            System.out.println("Index of number " + number + " in sorted array: " + index);
        }


    }
}