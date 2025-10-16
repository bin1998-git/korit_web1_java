package _02_Variable;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.net.StandardSocketOptions;

public class DataType {
    public static void main(String[] args) {
        String name = "박정빈"; // 데이터는 숫자로 바뀌어서 저장 됨 (2진수)
        // 변수타입(자료형)이란, 저장된 2진수패턴을 어떻게 해석할지 정의한 것
        System.out.println(name);

        // 종류
        // 1. 정수타입
        byte byteNum = 127; // 1byte
        short shortNum = 32000; // 2byte
        int intNUM = 21; // 4byte = 32bit -> 42억개 표현가능/ -21억 ~ 21억 *
        long lingNum = 3_000_000_000L; // 8byte -> 제일 크다 *

        // 2. 실수(소숫점) 타입
        float smallBox = 3.14F; // 4byte - 소숫점 7자리까지 정확
        double bigBox = 3.14; // 8byte - 소숫점 15자리까지 정확 *

        // 3. 문자타입 - 글자 1개
        char char1 = 'A'; // 아스키코드
        char char2 = 65 + 1; // 'B'
        System.out.println(char2);

        // 4. 문자열 - 문자들의 집합(배열)
        String str = "안녕하세요";
        System.out.println(str);

        // 5. 논리형 - true 혹은 flase만 저장
        boolean isEmpty = true;
        boolean isLogin = true;
        boolean isOut = true;


    }
}
