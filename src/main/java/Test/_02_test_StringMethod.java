package Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _02_test_StringMethod {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("파일이름을 입력하세요");
        String file = sc.nextLine();


        if(!file.contains(".")) {
            System.out.println("잘못된 파일 이름입니다. '.'이 포함되어야 합니다. ");

        } else {
            int dotIndex = file.indexOf(".");
            String name = file.substring(0, dotIndex);
            String ext = file. substring(dotIndex + 1);

            System.out.println("파일명 : " + name);
            System.out.println("확장자 : " + ext);
        }


    }
}
