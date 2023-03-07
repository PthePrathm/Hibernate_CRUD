package Programming;

public class NumberPattern2R {
    public static void main(String[] args) {
        int line = 7;
        int star = 1;
        int ch = 3;
        for (int i = 0; i < line; i++) {
            int ch1=ch;
            for (int j = 0; j < star; j++) {
                System.out.print(" " + ch1++ + " ");
            }
            System.out.println();
            if (i <= 2) {
                star++;
                ch--;
            } else {
                star--;
                ch++;
            }
        }
    }
}
