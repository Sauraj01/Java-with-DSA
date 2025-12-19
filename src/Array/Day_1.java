package Array;
public class Day_1 {

    public static int findMax(int arr[]){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int findMx(int arr[]){
        int mx = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }




    public static void main(String[] args) {
        int arr[] = {43, 32, 67, 74, 35, 45};

       int value = findMx(arr);
        System.out.println("Max value is : " + value);



        int value1 = findMin(arr);
        System.out.println("Min value is : "+value1);
    }




}
