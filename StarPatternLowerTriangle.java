package Programming;

public class StarPatternLowerTriangle {
    public static void main(String[] args) {
        int lines=5;
        int star=1;
        for (int i=0;i<lines;i++){
            for (int j=0;j<star;j++){
                System.out.print(" * ");
            }
            System.out.println();
            star++;
        }
    }

}
