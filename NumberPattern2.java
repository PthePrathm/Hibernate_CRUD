package Programming;

public class NumberPattern2 {
    public static void main(String[] args) {
        int lines=5;
        int star=5;
        int ch1=1;
        for (int i=0;i<lines;i++){
            int ch2=ch1;
            for (int j=0;j<star;j++){
                System.out.print(ch2+"  ");
                ch2+=5;

            }
            System.out.println();
            ch1++;
        }
    }
}
