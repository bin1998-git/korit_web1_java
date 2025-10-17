package Test;

import java.util.Scanner;

public class _01_test {
    public static void main(String[] args) {

        String name = "박정빈";
        int age = 28;
        boolean isAdult = (age >= 20);
        String comment = isAdult ? "성인" : "미성년자";
        String region = "수영구";

        System.out.println("나의 이름은 : " + name);
        System.out.println("나의 나이는: " + age);
        System.out.println("성인여부 : " + comment);
        System.out.println("사는 지역 : " + region);

        // 1부터 30까지의 합을 구하세요
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 >>");;
        int num = sc.nextInt();
        int sum = 0;

        for(int i =1; i <= num; i++) {
            sum = sum+i;
        }
        System.out.println("1부터 100까지의 합 : " + sum);



    }
}
