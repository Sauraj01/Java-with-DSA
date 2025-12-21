package Array;

public class Day_3 {

    public static int uniqueOne(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i=0;i<n;i++){
                if (arr[i] > 0){
                    ans = arr[i];
                }
        }
        return ans;
    }

    public static int TriplePairSum(int arr[], int target){
        int n = arr.length;
        int ans = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans ++;
                    }
                }
            }
        }
        return ans;
    }
    public static int pairSum(int arr[], int target){
        int n = arr.length;
        int ans = 0;
        for (int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){


        // ----------- Array Provided----------

//        int arr[] = {2, 3, 4, 1, 5, 1};
//        int target = 7;
//        System.out.println("Maximum pair is : "+pairSum(arr,target));
//        System.out.println("Maximum triple pair is : " + TriplePairSum(arr,target));


        // ------------ Array taking Input from user--------


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the size of Array : ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        System.out.println("Enter " + n + " Elements");
//        for (int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }

//        System.out.println("Enter the Target : ");
//        int target = sc.nextInt();
//
//        System.out.println("Maximum pair is : "+pairSum(arr,target));
        int arr[] = {11,22,32,22,11};
        System.out.println("Unique Number is : "+uniqueOne(arr));



    }
}
