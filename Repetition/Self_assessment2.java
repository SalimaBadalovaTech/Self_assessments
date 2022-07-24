package Repetition;

public class Self_assessment2 {

    /*  Name circles
        Calculate the sizes of circles
        Find the biggest circle
     */


    public static void main(String[] args) {
        int r1 = 23;
        int r2 = 8;
        int r3 = 15;
        double s1 = Saheler(r1);
        double s2 = Saheler(r2);
        double s3 = Saheler(r3);
        System.out.println(s1 + " , " + s2 + " , " + s3);
        double Saheler[] = {s1, s2, s3};
        int maxReqem = maxSahe(Saheler);
        System.out.println(maxReqem);
        String[] CircleNames = {"Afaq", "Arif", "Ulfet" };
        String winnerCircle = winnerCircle(CircleNames,maxReqem);
        System.out.println(winnerCircle);
    }
    public static double Saheler (int r) {

        double Sahe = 3.14 * r * r;
        return Sahe;
    }

    public static int maxSahe (double[] Saheler) {
        double maxSahe = Saheler[0];
        int max = 0;
        for (int i = 0; i < Saheler.length; i++) {
            if (Saheler[i] > maxSahe) {
                maxSahe = Saheler[i];
                max = i;
            }
        }
        return max;
    }

    public static String winnerCircle (String[] CircleNames, int max) {

        String winnerCircle =CircleNames[max];
        return winnerCircle;
    }
}


