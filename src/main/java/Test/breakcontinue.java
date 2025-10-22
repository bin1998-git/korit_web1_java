package Test;

import java.util.Scanner;

public class breakcontinue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String PW = "1234";
        int maxTry = 5;
        int count = 0;

        while (count < maxTry) {
            System.out.println("비밀번호를 입력하세요");
            String input = sc.nextLine();
            count++;

            if (input.equals(PW)) {
                System.out.println("로그인 성공!");
                break;
            } else {
                if (count < maxTry) {
                    System.out.println("비밀번호가 틀렸습니다");
                    System.out.println("다시 입력하세요.");
                }

            }
        }

        if (count == maxTry) {
            System.out.println("5회 이상 틀렸습니다. 계정이 잠겼습니다");
        }


        while (true) {
            System.out.println("비밀번호를 입력하세요 >>");
            String input = sc.nextLine();
            count++;
            if (input.equals(PW)){
                System.out.println("로그인 성공!");
                break;
            }
            else {

                if (count < maxTry) {
                    System.out.println("비밀번호가 틀렸습니다!");
                    System.out.println("다시 입력하세요");
                    continue;
                }
                else {
                    System.out.println("5회 이상 틀렸습니다. 계정이 잠겼습니다. ");
                    break;
                }
            }
        }

    }
}
