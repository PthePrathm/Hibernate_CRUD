package Programming;

public class PerfectNumber {
    public static void main(String[] args) {
        for(long i=1;i<=1000000000;i++){
            int sum=0;
            for (int j=1;j<i;j++){
                if (i%j==0){
                    sum+=j;
                }
            }
            if (sum==i)
                System.out.print(i+" ");
        }
    }
}
