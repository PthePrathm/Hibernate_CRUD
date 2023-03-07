package Programming;

public class PalindromeCheck {
    public static void main(String[] args) {

        for (int i = 10; i < 10000; i++) {
            int sum = 0;
            int a=i;
            int temp=a;
            while (a != 0) {
                int r = a % 10;
                sum = sum * 10 + r;
                a /= 10;
            }
            if (sum == temp)
                System.out.print(sum+" ");
        }
    }
}
