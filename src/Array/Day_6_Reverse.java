package Array;
public class Day_6_Reverse {

    public static int[] reversArray(int[] arr){
        int  n = arr.length;
        int[] ans = new int[n];

        int j = 0;
        for (int i = n-1;i>=0;i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        int n = arr.length;
        int i =0; int j = n-1;
        while (i < j){
            swap(arr, i , j);
            i++;
            j--;
        }
    }

    public static void printArray(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverse(int[] arr){
        int left = 0, right = arr.length -1;
        while (left < right){
            int temp = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(reverse(arr));
//        int[] ans = reversArray(arr);
//        reverseArray(arr);
//        System.out.println("Print Array with Extra Space");
//        printArray(ans);
//        System.out.println();
//        System.out.println("Print Array without Extra Space");
//        printArray(arr);
    }
}
