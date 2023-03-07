package Programming;
public class FebonacciByRecurssion {
    public static void main(String[] args) {
        febo();
    }
    static int a;static int i=0;static int n1=0;static int n2=1;
    public static void febo(){
        if (i<=20){
            System.out.print(n1+" ");
            a=n1+n2;
            n1=n2;
            n2=a;
            i++;
            febo();
        }
    }
}
