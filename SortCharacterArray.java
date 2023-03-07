package ArrayLectures;

import java.util.Arrays;

public class SortCharacterArray {
    public static void main(String[] args) {
        char[] arr={'F','A','C','B','E','D'};
        System.out.println(Arrays.toString(arr));

        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (char b:arr)
            System.out.print(b+" ");
    }

}
