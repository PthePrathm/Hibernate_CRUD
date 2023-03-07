package ArrayLectures;

import java.util.Arrays;

public class Array3 {
    //Find third smallest number
    public static void main(String[] args) {
        int[] arr=RandomArray.randomArr(7);
        System.out.println(Arrays.toString(arr));
        int min1=arr[0];
        int min2=arr[1];
        int min3=arr[2];
        for (int a:arr){
            if (min1<a){
                min3=min2;
                min2=min1;
                min1=a;
            }
            else if (min3<a && (a!=min1 || a!=min2)){
                min3=a;
            }
        }
        System.out.println("Third smallest number is: "+min3);
    }
}
