package ArrayLectures;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr=RandomArray.randomArr(10);
        System.out.println("Unsorted array: "+ Arrays.toString(arr));

        for (int i=0;i<arr.length;i++){
            int minIdx=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[minIdx])
                    minIdx=j;
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
        System.out.print("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
