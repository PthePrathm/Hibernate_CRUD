package Programming;

public class SpyNumbers {
    public static void main(String[] args) {
        for (int i=10;i<100000;i++){
            int add=0;
            int mul=1;
            int temp=i;
            //int sum=0;
            while (temp != 0) {
                int r = temp % 10;
                add = add+r;
                mul = mul*r;
                temp = temp / 10;
            }
            if (add==mul)
                System.out.print(i+" ");
        }
    }
}
