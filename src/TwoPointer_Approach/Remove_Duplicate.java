package TwoPointer_Approach;

public class Remove_Duplicate {

    public static int removeDuplicate(int[] arr){
        int n = arr.length;
        int i = 0, j = 1;
        int res = 1;

        while (j < n){
            if (arr[j] == arr[j-1]){
                j++;
                continue;
            }
            else {
                arr[i + 1] = arr[j];
                res++;
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        System.out.println(removeDuplicate(arr));
    }
}
