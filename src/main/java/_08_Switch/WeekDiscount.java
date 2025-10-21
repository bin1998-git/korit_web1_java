package _08_Switch;

import java.util.Scanner;

public class WeekDiscount {
    public static void main(String[] args) {
        // 요일마다 할인율이 다르다!
        // 1. 스캐너를 통해 요일을 입력 받는다
        Scanner sc = new Scanner(System.in);
        System.out.println("요일을 입력하세요 >> ");
        String Day = sc.nextLine();

        // "월", "월요일" 두가지 모두 switch 문을 통과하게끔 가공
        // 삼항연산자
        Day = Day.contains("요일") ? Day : Day + "요일";
        int basePrice = 10000;
        double discountPrice = 0;
        // 2. switch - case 문을 통해 요일마다 다른 할인율을 적용
        // 월-10%, 화/수/목 = 5% , 금 =15%, 토/일-20%, 그외-0%
        switch (Day) {
            case "월요일":
                discountPrice = 0.10;
                break;
            case "화요일", "수요일", "목요일":
                discountPrice = 0.05;
                break;
            case "금요일":
                discountPrice = 0.15;
                break;
            case "토요일", "일요일":
                discountPrice = 0.20;
                break;
            default:
                discountPrice = 0;
                System.out.println("올바른 요일을 입력하세요 ");
                break;

        }
         // 가격 계산
        // 할인금액
        double discount =  basePrice * discountPrice;
        // 할인된 최종금액
        double finalamount =  basePrice - discount;



        /*
         최종 출력
         오늘: ~요일
         정가: ~원
         할인금액 : ~원
         최종가격: ~원
         */
        System.out.println("오늘 : " + Day);
        System.out.println("정가: " + basePrice + "원");
        System.out.println("할인금액 " + discount + "원");
        System.out.println("최종가격" + finalamount);

    }
}
