package ArrayLectures;

public class SpinCount {
    public static void main(String[] args) {
        String [] arr={"Right","Right","Right","Right","Left","Right"};
        int right=0;
        int left=0;
        int fullRotation=0;
        for (int a=0;a< arr.length;a++){
            if (arr[a].equalsIgnoreCase("Right")){
                right++;
            } else if (arr[a].equalsIgnoreCase("Left")) {
                left++;
            }
        }
        int rotationToRight=right*90;
        int rotationToLeft=left*90;

        if (rotationToLeft>rotationToRight){
            int a=rotationToLeft-rotationToRight;
            if (a%360==0)
                fullRotation++;
        }
        else{
            int b=rotationToRight-rotationToLeft;
            if (b%360==0)
                fullRotation++;
        }

        System.out.println(fullRotation+" full rotations are done");


    }
}
