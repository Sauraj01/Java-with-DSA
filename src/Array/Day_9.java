package Array;



public class Day_9 {

    public static int findMax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }
        }
        return max;
    }


    public static int findSecondMax(int[] arr){
        int n = arr.length;
        int max = findMax(arr);
        for (int i = 0; i < n; i++){
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 8,  6, 1 ,9, 3};

//        System.out.println("Max is = " + findMax(arr));
        System.out.println("Second Max is = " + findSecondMax(arr));
    }
}
