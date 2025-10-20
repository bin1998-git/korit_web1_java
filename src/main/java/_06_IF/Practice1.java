package _06_IF;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Practice1 {
    public static void main(String[] args) {
        // 10만원 이상이면 10%할인, 아니면 할인없음
        // 가격에 따라 출력해주세요
        Scanner sc = new Scanner(System.in);
        System.out.println("가격을 입력하세요 >>");

        int price = sc.nextInt();
        sc.nextLine();

        if (price >= 100000) {
            // 10% 할인 코드 작성
            double discountPrice = price * 0.9; // 정수 * 시루
            System.out.println("최종가격 :" + discountPrice);
        } else {
            // 아무런 할인 없음
            System.out.println("최종가격 :" + price);
        }

        // 실습2) 로그인
        String realId = "java";
        String realPW = "1234";

        // 사용자 입력
        System.out.println("아이디를 입력: ");
        String inputId = sc.nextLine();

        System.out.println("패스워드 입력: ");
        String inputPW = sc.nextLine();

        //입력값과 실제값 비교 ->
        // 아이디 패스워드가 일치할 경우에 "로그인성공" 출력
        // 아이디 패스워드가 둘 중 하나라도 일치x "로그인 실패" 출력
        // String 자료형 비교시 euqals 매서드 사용, == 연산자는 사용x

        boolean isValidId = realId.equals(inputId);
        boolean isValidPw = realPW.equals(inputPW);
        boolean isValidLogin = isValidId && isValidPw;


        if (isValidId) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");


        }
    }
}
