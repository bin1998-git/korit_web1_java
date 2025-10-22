package Test;

public class arraytest {
    public static void main(String[] args) {
        int[] scores = {80, 90, 75, 100, 65};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = (double) sum / scores.length;
        System.out.println("평균점수 :" + avg);
    }


}


