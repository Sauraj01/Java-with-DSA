package Array;
public class Day_4 {

    static int firstRepeatingNumber(int arr[]){
        int ans  = -1;
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i] == arr[j]){
                    ans = arr[i];
                }
            }
        }
        return ans;
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
    public static int findSecondMax(int arr[]) {
        int max = findMx(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int SecondMax = findMx(arr);
        return SecondMax;
    }

    public static void main(String[] args) {
        int arr[] = {12,34,23,65,76,34};
        System.out.println("Second Max is : "+findSecondMax(arr));
        System.out.println("First repeating no. is : " +firstRepeatingNumber(arr));
    }
}
