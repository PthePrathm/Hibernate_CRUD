package Programming;

public class FindPrime {
    public static void main(String[] args) {
        int noOfPrimeNumber=0;
        for (int i=2;i<10000;i++){
            int count=0;
            for (int j = 1; j<= i; j++){
                if (i %j==0)
                    count++;
            }
            if (count==2)
                //System.out.print(i+" ");
                noOfPrimeNumber++;
        }
        System.out.println("There are total "+noOfPrimeNumber+" Prime numbers ");
    }
}
