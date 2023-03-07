package Programming;

public class Pattern2 {
    public static void main(String[] args) {
        int line=7;
        int star=4;
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                System.out.print(" * ");
            }
            System.out.println();
            if(i<=2)
                star--;
            else
                star++;
        }
    }
}
