public class Escape {
    public static void main(String[] args) {
        /*
        이스케이프 문자
        문자열 안에 이스케이프 문자를 사용할 수 있다.
        \n : 줄바꿈 - 엔터키와 같은효과
        \t : 탭 - 스페이스바 4칸 효과
        \' : 작은 따옴표 문자로 인식
        \" : 큰따옴표 문자로 인식
        \\ : 백슬래시 문자로 인식

         */

        System.out.println("집에\n가고\n싶다");
        System.out.println("이름:\t" + "박정빈");
        // 파일 경로 c:\program Files\Java
        System.out.println("c:\\program Files\\Java");
        
    }
}
