package Programming;

public class NumberPalindrome {
    public static void main(String[] args) {
        int a=10201;
        int b=a;
        int sum=0;
        while(a!=0){
            int r=a%10;
            sum=sum*10+r;
            a/=10;

        }
        if (sum==b)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");

    }
}
