package _29_Wrapper;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};
        // 1. Integer배열로 변환해주세요
        // Integer.valueOF(int 값) -> 박싱
        // scores를 for 문을 돌면서 박싱을 해줘야 겠다.
        // 어디에 담지? -> Integer 배열을 하나 만들어야 겠다.
        Integer[] integersScores = new Integer[scores.length];
        for (int i = 0; i < scores.length; i ++) {
           int intValue = scores[i]; // int값 추출
            Integer integerValue = intValue; // 오토박싱
            integersScores[i] = integerValue;
        }
        System.out.println(Arrays.toString(integersScores));
        // 2. 최고점, 최저점을 적절한 Integer 메서드를 사용해서 구해주세요
        // max(): 두개 비교해서 큰값 리턴, min(): 두개 비교해서 작은 값 리턴


        // 1. for문으로 순회
        // 2. 순회하면서 비교(max, min)
        // -> 비교결과 큰걸 maxScore /  작은걸 minScore
        // 업데이트
        Integer maxScore = integersScores[0]; // 0번 값을 기준으로
        Integer minScore = integersScores[0]; // 0번 값을 기준으로

        // 향상 for문도 가능
        for (int i = 1; i < integersScores.length; i++) {
            Integer maxValue = Integer.max(maxScore,integersScores[i]);
            maxScore = maxValue; // 비교결과를 업데이트(대입)
            Integer minValue = Integer.min(minScore,integersScores[i]);
            minScore = minValue; // 작은값 비교결과를 업데이트(대입)
        }
        System.out.println("최고점: " + maxScore);
        System.out.println("최저점: " + minScore);





    }
}
