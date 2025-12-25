package Array;

import java.util.Arrays;

public class Day_8 {

    public static void Main(int[] a){
        int n = a.length;
        for (int i=0; i<n-1; i++){
            System.out.print(a[i] + ", ");
        }
    }


    public static int[] findSmallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    public static boolean isSortedOrNot(int[] arr){
        boolean check = true;
        for (int i=1; i<arr.length; i++){
            if (arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    public static int findElementIndex(int[] arr){
        int lastIndex = -1;
        int x = 8;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }


    public static int Occurrence(int[] arr){
        int count = 0;
        int x = 5;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }


    public static int findLargest(int[] arr){
        int largest = arr[0];
        for (int i=0; i<=arr.length-1; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
            return largest;
    }

    public static int findSecondLargest(int[] a){
        int n = a.length;
        int largest = a[0], secLargest = -1;
        for (int i=0; i<n; i++){
            if (a[i] > largest){
                secLargest = largest;
                largest = a[i];
            }
//            else if (a[i] < largest && a[i] > secLargest) {
//                secLargest = a[i];
//            }
        }
        return secLargest;
    }

    public static int findSmallest(int[] a){
        int smallest = a[0];
        for (int i=1; i<=a.length; i++){
            if (a[i] < smallest){
                smallest = a[i];
            }
        }
        return smallest;
    }

    public static int sumOfArray(int[] a){
        int sum = 0;
        for (int result : a){
            sum += result;
        }
        return sum;
    }


    public static void findNumber(int[] a){
        int x = 8;
        int ans = -1;
        for (int i=0; i<a.length; i++){
            if (a[i] == x) {
                ans = i;
            }
        }
        System.out.println(x + " is present at index " + ans);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 8, 1, 2, 5};
//        Main(arr);
//        System.out.println("Largest number of Array = " + findLargest(arr));
//        System.out.println("Second Largest number of Array = " + findSecondLargest(arr));
//        System.out.println("Smallest number of Array = " + findSmallest(arr));
//        System.out.println("Sum of Array is : " + sumOfArray(arr));
//        findNumber(arr);
//        System.out.println("Occurrence of Your is : " + Occurrence(arr));

//        int[] ans = findSmallestAndLargest(arr);
//        System.out.println("First Index element : " + ans[0]);
//        System.out.println("Last Index element : " + ans[1]);

//        System.out.println("Element of index is : " + findElementIndex(arr));
        System.out.println(isSortedOrNot(arr));



    }
}
