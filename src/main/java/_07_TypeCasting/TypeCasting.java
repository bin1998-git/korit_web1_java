package _07_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 : 데이터 타입 다른 타입으로 변경하는 것
        // 자료형 크기
        // 큰 -> 작은: 넘칠 수 있다. -> 데이터 유실 가능성이 존재한다.(명시적 형변환 필요)
        // 작은 -> 큰: 안전하다 -> 데이터 유실 가능성이 없다.(자동 형변환)

        // 작은 -> 큰(자동 형변환)
        int intvalue = 10;
        long longValue;
        double doubleValue;

        intvalue = intvalue; // 10L로 자동 변환
        doubleValue = intvalue; // 10.0으로 자동 변환

        // 큰 -> 작은(명시적 형변환)
        doubleValue = 1.5;
        intvalue = (int) doubleValue; // 명시적 형변환
        System.out.println(intvalue); // 1.5 -> 1: 데이터 유실이 일어난것

        // 다른 타입끼리 연산할때 형변환
        // 규칙: 더 큰 범위타입으로 자동변환 후 연산
        intvalue = 1;
        doubleValue = 1.5;
        // double이 더큰 자료형이라서 자동으로 결과가 double로 변환
        System.out.println(intvalue + doubleValue);

        // 평균연산
        int kor = 80;
        int eng = 90;
        int math = 90;
        // 3말고 3.0(실수)로 여산해서 소숫점 아래를 살려준다.
        System.out.println((kor + eng + math) / 3.0);

        // 문자열 -> 숫자
        int i =Integer.parseInt("34");
        System.out.println(i + 1);
        double d = Double.parseDouble("34.44");
        System.out.println(d + 0.1);
    }
}
