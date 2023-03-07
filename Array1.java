package ArrayLectures;

public class Array1 {
    //find largest number in array
    public static void main(String[] args) {
        int [] arr={1,2,5,3,7,10};
        int max=arr[0];
        for (int a:arr){
            if (a>max)
                max=a;
        }
            System.out.println("Maximum value in array is:"+max);
    }

}
