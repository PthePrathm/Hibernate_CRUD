package Programming;
import java.lang.Math;
public class AmstrongNumber {
    public static void main(String[] args) {
        for (int i = 10; i <= 10000; i++) {
            int a =i;
            int temp=a;
            int sum = 0;
            int count=0;        //count is used to store the number of digitd in the number
            while(a!=0){
                a/=10;
                count++;
            }
            while (temp != 0) {
                int r = temp % 10;
                sum = (int) (sum + Math.pow(r, count));
                temp = temp / 10;

            }
            if (sum == i)
                System.out.print(i+" ");
        }
    }
}