package SlidingWindow_Approach.fixed_window;

public class findMaximum {
    public static int findKMaxNumber(int[] a, int k){

        if (a.length < k){
            throw new RuntimeException("Your Array length is not enough for k");
        }
        int windowSum = 0;
        for (int i=0; i<k; i++){
            windowSum += a[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < a.length; i++) {
            windowSum = windowSum + a[i] - a[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static int maxSumArray(int[] arr, int k){
        int n = arr.length;
        int left = 0, right = 0;
        int windowSum = 0;
        int maxSum = 0;
        int len = right-left+1;

        while (right < n){
            windowSum = windowSum + arr[right];

            if (len > k){
                windowSum = windowSum - arr[left];
                left++;
            }

            if (len == k){
                maxSum = Math.max(maxSum, windowSum);
            }

            right++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(findKMaxNumber(arr, k)); // Output: 9
        System.out.println(maxSumArray(arr, k)); // Output: 9
    }

}
