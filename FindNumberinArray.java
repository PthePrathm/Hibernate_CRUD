package ArrayLectures;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumberinArray {
    public static void main(String[] args) {
        int[] arr=RandomArray.randomArr(7);
        System.out.println(Arrays.toString(arr));
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a number to search in array");
        int num=sc1.nextInt();
        int count=0;
        int a=0;
        for (int i=0;i<arr.length;i++){
            if (num==arr[i]){
                a=i;
                count++;
            }
        }
        if (count==1)
            System.out.println("Number is present in the array at: "+ (a+1) +"th position");
        else
            System.out.println("Number is not present");
    }
}
