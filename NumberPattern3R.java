package Programming;

public class NumberPattern3R {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        int ch = 1;
        for (int i = 0; i < line; i++) {
            int ch1=ch;
            for (int j = 0; j < star; j++) {
                if (i+j<4)
                    System.out.print(" " + ch1++ + " ");
                else
                    System.out.print(" "+ch1+" ");
            }
            System.out.println();
            ch++;
        }
    }
}
