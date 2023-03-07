package Programming;

public class NumberPatterns {
    public static void main(String[] args) {
        int lines=5;
        int star=5;
        for (int i=0;i<lines;i++){
            int ch1=1;
            char ch2='A';
            for (int j=0;j<star;j++){
                if(i%2==0){
                    System.out.print( ch1++ +" " );
                }
                else{
                    System.out.print( ch2++ +" ");
                }
            }
            System.out.println();
        }
    }
}
