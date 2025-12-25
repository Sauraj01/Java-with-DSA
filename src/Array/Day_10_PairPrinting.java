package Array;

public class Day_10_PairPrinting {

    public static void printSubArray(int arr[]){
        int totalPair = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                for (int k=i; k<j; k++) {
                    System.out.print(arr[k] + " ");
                    totalPair++;
                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total Pairs = " + totalPair);
    }

    public static void printPair(int arr[]){
        int totalPair = 0;
        for (int i=0; i<arr.length; i++){
            int curr = arr[i];
            for (int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + totalPair);
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
//        printPair(arr);
        printSubArray(arr);
    }
}
