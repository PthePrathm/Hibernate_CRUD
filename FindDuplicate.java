package ArrayLectures;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr=RandomArray.randomArr(10);
        System.out.println(Arrays.toString(arr));
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j] && i!=j)
                    System.out.println(arr[i]);
            }
        }
    }
}
