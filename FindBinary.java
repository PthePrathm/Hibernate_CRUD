package Programming;

public class FindBinary {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int i=0;
        int a=69;
        while(a!=0){
            int r=a%2;
            arr[i]=r;
            i++;
            a/=2;
        }
        for (int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
