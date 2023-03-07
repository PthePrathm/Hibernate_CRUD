package Programming;

public class NumberPattern5R {
    public static void main(String[] args) {
        int line=4;
        int star=1;
        int space=3;
        for (int i=0;i<line;i++){
            int ch=i;
            for (int k=0;k<space;k++){
                System.out.print("   ");
            }
            for (int j=0;j<star;j++){
                if (i>j)
                    System.out.print(" "+ch--+" ");
                else
                    System.out.print(" "+ ch++ +" ");
            }
            System.out.println();
            star+=2;
            space--;
        }
    }

}
