package _01_print;

import java.util.Arrays;

public class Printf {
    public static void main(String[] args) {
        /*
        형식지정자
        %d(decimal) -> 정수
        %f(float) -> 실수
        %s(string) -> 문자열
        %c(character) -> 문자
         */

        int age = 25;
        double height = 173.5;
        String name = "홍길동";

        // "제 이름은 ~이고, 나이는 ~살이고, 키는 ~cm입니다." // %.1 , %.2 는 소수점 첫째자리까지, 둘째짜리까지
        System.out.printf("제 이름은 %s 이고, 나이는 %d살이고, 키는 %.1fcm 입니다.",
                name,
                age,
                height
                ); // 순서에 맞춰서 형식지정자와 동기화 됩니다.
    }
}
