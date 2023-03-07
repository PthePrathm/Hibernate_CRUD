package Programming;

public class NumberPattern6 {
    public static void main(String[] args) {
        int line=5;
        int star=1;int ch1=1;
        for (int i=0;i<line;i++){
            int ch2=1;
            for (int j=0;j<star;j++){
                System.out.print(" "+ch2++ *ch1+" ");
            }
            System.out.println();
            star++;
            ch1++;
        }
    }
}
