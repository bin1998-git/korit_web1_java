package _13_Array;

public class Practice2 {
    public static void main(String[] args) {

        // 실습3) scores의 평균을 구해 주세요.
        // 추가요구사항)
        // 1. 평균이상의 학생 수를 구해주세요. (int count)
        // 2. 최고점수를 찾아서 출력해 주세요. (int max)


        // 배열의 길이 활용!
        int[] scores = {80, 90, 75, 100, 65, 88 , 91, 70};
        int max = 0;
        int count = 0;
        // 평균 -> 총합 / 갯수(길이)
        int sum = 0;
        for (int score : scores){
            sum += score; // sum = sum + score
        }
        double avg = sum / scores.length;
        System.out.println("평균점수 :" + avg);

        for (int score : scores) { // 배열에서 하나씩 꺼내온다
            if (score > max) { // 꺼내온 값이 현재 max보다 크다면
                max = score; // 그 값을 max값으로 업데이트 하겠다
            }
            if (score >= avg) {
                count++;
            }
        }
        System.out.println("평균이상 학생 수 :" + count + " 명 ");
        System.out.println("최고 점수 " + max);
    }
}
