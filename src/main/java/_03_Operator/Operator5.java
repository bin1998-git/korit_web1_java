package _03_Operator;

public class Operator5 {
    public static void main(String[] args) {
        // 삼항연산자
        int x = 5;
        int y = 3;
        // boolean데이터 ? true일때 대입될 값 : false일때 대입될 값
        int max = x > y ? x : y;
        boolean isSame = x ==y ? true : false;
        // 조건문과 다른점: 결과가 값이다.
        String sameStr = x == y ? "같음" : "다름";

        // 중첩도 가능하다
        int age = 17;
        String ticketName = age >= 19 ? "성인요금"  // 조건 ? true 데이터
                : age >= 14 ? "청소년요금" // 조건 ? true 데이터
                : "어린이요금"; // 모든 조건 충족이 안될 때

        // 실습1) 키가 120 이상인 경우 탑승가능하도록 하는 삼항연산자
        // 탑승 가능한경우 "탑승가능" 불가능 하면 "탑승 불가능" 출력
        int height = 110;
        String maxHeight = 110 <= 120 ? "탑승가능" : "탑승 불가능";

    }
}
