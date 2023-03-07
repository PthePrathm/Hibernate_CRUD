package Programming;

public class NumberPatternLowerTriangle {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int ch=1;
        for(int i=0;i<line;i++){
            int ch2=ch;
            for(int j=0; j<star; j++){
                System.out.print(ch2+" ");
                ch2++;
            }
            System.out.println();
            star++;

        }
    }
}
