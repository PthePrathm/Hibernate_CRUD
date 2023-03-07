package Programming;

public class Pattern {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        //for square pattern
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        //for hollow square
        for(int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if(j==0||i==0||i==4||j==4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //for left diagonal square
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if(j==0||i==0||i==4||j==4||i==j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
        System.out.println();

        //for right diagonal square
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if(j==0||i==0||i==4||j==4|| i+j==4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();

        //for lower hollow triangle
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if(j==0||i==4|| i==j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
        //for reverse hollow triangle
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if(j==0||i==0|| i+j==4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();

        //for plus sign
        for (int i=0;i<line;i++){
            for (int j=0;j<star;j++){
                if(j==2||i==2)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
