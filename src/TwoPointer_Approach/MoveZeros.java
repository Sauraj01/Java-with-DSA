package TwoPointer_Approach;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZerosAtLast(int[] arr){

        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void moveZerosAtFirst(int[] arr){

        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,0,6,0,8,0,1,2,0};

        System.out.println("Before " + Arrays.toString(arr));
    //    moveZerosAtFirst(arr);
        moveZerosAtLast(arr);
        System.out.println("After " + Arrays.toString(arr));

    }

}

