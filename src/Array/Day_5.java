package Array;
public class Day_5 {
    void SumAllElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements : " + sum);
    }

    static int smallestNumber(int arr[]) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        return min;
    }

    static int secondSmallestNumber(int arr[]) {
        int min = smallestNumber(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == min) {
                    arr[i] = Integer.MAX_VALUE;
                }
            }
        }
        int secondMin = smallestNumber(arr);
        return secondMin;
    }

    public static void main (String[]args){
        Day_5 g5 = new Day_5();
        int arr[] = {1, 2, 3, 0, 5};

        g5.SumAllElements(arr);
        System.out.println("Smallest element is : " + smallestNumber(arr));
        System.out.println("Second smallest is : " + secondSmallestNumber(arr));
    }
}
