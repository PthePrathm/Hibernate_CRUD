package ArrayLectures;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //Find second largest number in array
        int[] arr=RandomArray.randomArr(5);
        System.out.println(Arrays.toString(arr));
        int max1=arr[0];
        int max2=arr[1];
        for (int a:arr){
            if (max1<a) {
                max2 = max1;
                max1 = a;
            } else if ((a>max2 && a!=max1)) {
                max2=a;
            }

        }
        System.out.println("Largest number is: "+max1);
        System.out.println("Second largest number is: "+max2);
    }
}
