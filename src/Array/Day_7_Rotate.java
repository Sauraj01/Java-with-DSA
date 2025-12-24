package Array;

import java.util.Scanner;

public class Day_7_Rotate {
    public static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k ; i < n ; i++){
            ans[j++] = arr[i];
        }
        for (int i = 0 ; i < n - k ; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rotateInSpace(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        swap(arr,0,n - k -1);
        swap(arr, n - k,n - 1);
        swap(arr, 0, n -1);
    }

    public static void printArray(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k times : ");
        int k = sc.nextInt();

        System.out.println("Given array : ");
        printArray(arr);

    //    int[] ans = rotateArray(arr, k);

        rotateInSpace(arr, k);

        System.out.println("Rotated array : ");
        printArray(arr);



    }
}
