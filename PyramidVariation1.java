package Programming;

public class PyramidVariation1 {
    public static void main(String[] args) {
        int line=3;
        int star=1;
        int space=2;
        int ch=1;
        for (int i=0;i<line;i++){
            for (int k=0;k<space;k++){
                System.out.print("   ");
            }
            for (int j=0;j<star;j++)
            {
                if (j==i)
                    System.out.print(" "+ch+" ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
            star+=2;
            space--;
            ch++;
        }
    }
}
