package TwoPointer_Approach;

import java.util.*;

public class Sorted_Squares {

    public static int[] sortedSquares(int[] arr){
        int n = arr.length;

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int num : arr){
            if (num < 0) neg.add(num);
            else pos.add(num);
        }



        // Case 1: No Negative Number

        if (neg.size() == 0){
            for (int i=0; i<pos.size(); i++){
                pos.set(i, pos.get(i) * pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }


        // Case 2: No Positive Number

        if (pos.size() == 0){
            for (int i=0; i<neg.size(); i++){
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }


        // Case 3: Both Negative and Positive Number

        int i = 0, j = 0, idx = 0;
        int n1 = neg.size();
        int n2 = pos.size();
        int[] res = new int[n1 + n2];

        // Square negatives and reverse them

        for (i=0; i<n1; i++){
            neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);


        // Square positive number

        for (i=0; i<n2; i++){
            pos.set(i, pos.get(i) * pos.get(i));
        }



        // Merge two sorted List

        i = 0;
        j = 0;

        while (i < n1 && j < n2){
            if (neg.get(i) <= pos.get(j)){
                res[idx] = neg.get(i);
                idx++;
                i++;
            }else{
                res[idx] = pos.get(j);
                idx++;
                j++;
            }
        }


        while (i < n1){
            res[idx] = neg.get(i);
            idx++;
            i++;
        }

        while (j < n2){
            res[idx] = pos.get(j);
            idx++;
            j++;
        }


        return res;
    }


    public static void main(String[] args) {
        int[] arr = {-11, -6, -5, -3, -1};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
