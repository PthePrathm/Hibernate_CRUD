package Programming;

public class FebonacciPattern {
    public static void main(String[] args) {
        int line=4;
        int star=1;
        for (int i=0;i<line;i++){
            int n1=0;
            int n2=1;
            for (int j=0;j<star;j++){
                System.out.print(n1+"  ");
                int a=n1+n2;
                n1=n2;
                n2=a;
            }
            System.out.println();
            star+=2;

        }
    }
}

