package Programming;

public class GreaterThanSign {
    public static void main(String[] args) {
        int line=7;
        int star=1;
        int space=0;
        for (int i=0;i<line;i++){
            /*for (int k=0;k<space;k++){
                System.out.print("   ");
            }*/
            for (int j=0;j<star;j++){
               if (j==star-1)
                   System.out.print(" * ");
               else
                   System.out.print("   ");
            }
            System.out.println();
            if(i<=2)
                star++;
            else
                star--;

        }
    }
}
