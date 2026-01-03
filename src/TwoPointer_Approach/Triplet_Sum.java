package TwoPointer_Approach;

import java.util.Arrays;

public class Triplet_Sum {

    public static void findTriplets(int[] arr){

        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0){
                    System.out.println(arr[i]+", "+arr[left]+", "+arr[right]);

                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                }else right--;
            }


        }
    }


    public static void main(String[] args) {

        int[] arr = {4, 6, 8, -1, 0, 1, -6, -3};

        findTriplets(arr);
    }
}
