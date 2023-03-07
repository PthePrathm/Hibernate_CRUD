package ArrayLectures;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr=RandomArray.randomArr(5);
        System.out.println(Arrays.toString(arr));

        //Number sorting

        /*Arrays.sort(arr);
        for (int i:arr)
            System.out.print(i+" ");*/

        for (int i=0;i<arr.length;i++){
            for (int j=i;j< arr.length-1-i;j++){      //arr.length-1 bcoz if we not take it, it will throw arrayindexoutofbound exception
                if (arr[i]>arr[i+1]){                 //arr.length-1-i is taken to avoid unnecessary iterations, as no. of phases increases the unnecessary iterations are equal to i ,so to avoid the
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int a:arr)
            System.out.print(a+" ");
    }
}
