package ArrayLectures;

public class FindMissingInSequenceArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9};
        int n= arr.length;
        int sum1=((n)*(n+1))/2;
        int sum2=0;
        for (int a:arr) sum2 += arr[a];
        int num=sum1-sum2;
        System.out.print("The Missing number is: "+num);
    }
}
