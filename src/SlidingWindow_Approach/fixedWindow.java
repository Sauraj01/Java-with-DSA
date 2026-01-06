package SlidingWindow_Approach;

public class fixedWindow {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int low = 0;
        int high = 1;
        int sum = 0;
        int res = 0;
        int n = arr.length;

        for (int i=low; i<=high; i++){
            sum = sum + arr[i];

            while (high < n){

                res = Math.max(res, sum);
                low++;
                high++;

                if (high == n){
                    break;
                }
                sum = sum - arr[low-1];
                sum = sum + arr[high];
            }
        }
    }
}
