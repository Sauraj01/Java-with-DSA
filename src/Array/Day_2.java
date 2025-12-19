package Array;

public class Day_2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int x = 0, y = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2 == 0){
                x++;
            }else {
                y++;
            }
        }
        System.out.println("Even is : " + x +","+ " Odd is : " + y);
    }
}
