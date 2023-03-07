package ArrayLectures;

import java.util.Arrays;
import java.util.Random;

public class ReturnSum {
    static Random rd=new Random();

    public static int[] randomArr(int n){
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=rd.nextInt(10);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr=randomArr(7);
        System.out.println(Arrays.toString(arr));
        int k=9;
        for (int a=0;a<arr.length;a++){
            for (int b=0;b<arr.length;b++){
                if (arr[a]+arr[b]==9){
                    System.out.println(arr[a]+","+arr[b]);
                }
            }
        }
    }
}
