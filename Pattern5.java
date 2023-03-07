package Programming;

public class Pattern5 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;

        for (int i=0;i<line;i++){
            for (int k=0;k<space;k++){
                System.out.print(" ");
            }
            for (int j=0;j<star;j++) {
                if (i < 4) {
                    if (j == 0 || j == i) {
                        System.out.print("* ");
                    } else
                        System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
            star++;
            space--;
        }
    }
}
