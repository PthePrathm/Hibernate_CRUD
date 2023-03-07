package Programming;

public class StrongNumber {
    public static void main(String[] args) {
        //addition of every digits factorial is the number itself is called as strong number
        //eg. 145 is strong number bcoz addition of 1!+4!+5! is 145
        int a=145;
        int temp=a;
        int sum=0;
        int fact=1;
        while(a!=0){
            int r=a%10;
            for (int i=0;i<r;i++){
                fact*=i;
            }
            sum+=fact;
            a=a/10;
        }
        if (sum==temp)
            System.out.println("Number is strong number");
    }
}
