package ArrayLectures;

import java.util.Random;

public class RandomArray {
    static Random rd=new Random();

    public static int[] randomArr(int n){
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=rd.nextInt(10);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=randomArr(5);
        for (int a:arr){
            System.out.println(a);
        }
    }
}
