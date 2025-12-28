package TwoPointer_Approach;


import java.util.Scanner;

public class Two_Sum {

    public static int twoSum(int[] arr, int target){
        int n = arr.length;
        int i = 0, j = n-1;

        while (i < j){

            int sum = arr[i] + arr[j];
            if (sum == target){
                System.out.println("Found at Index " + i + " and " + j);
                return 1;
            }
            if (sum < target) i++;
            else j--;
        }
        return -1;
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
        System.out.print("Enter the number of array : ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        int t = twoSum(arr,target);
        System.out.println(t);
    }
}
