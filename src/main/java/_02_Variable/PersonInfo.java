package _02_Variable;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.util.SortedSet;

public class PersonInfo {
    public static void main(String[] args) {
        // 실습
        /*
         아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
         변수를 출력해 주세요
         1.이름, 2.출생연도, 3.키(소숫점포함),
         4.혈액형, 5.학생여부(true,flase)
         */
        String name = "박정빈";
        int birthYear = 1998;
        double height = 180.3;
        char bloodType = 'B';
        boolean isStudent = false;

        System.out.println("이름"  + name);
        System.out.println("출생년도"  + birthYear);
        System.out.println("키"  + height);
        System.out.println("혈액형"  + bloodType);
        System.out.println("학생여부" + isStudent);


    }
}
