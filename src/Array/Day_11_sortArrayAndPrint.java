package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Day_11_sortArrayAndPrint {

//    Sort Array using inbuilt method


    public static void sortArrays(int[] arr){
        Arrays.sort(arr);
    }


//    Sort Array using manual method


    public static int[] sortArray(int[] a){
        int temp = 0;
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

//    Print Array using manual method

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array from user");
        printArray(arr);
        sortArrays(arr);
        System.out.println("Array from user");
        printArray(arr);
    }
}
