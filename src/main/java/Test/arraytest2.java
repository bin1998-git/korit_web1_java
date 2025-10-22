package Test;

public class arraytest2 {
    public static void main(String[] args) {
        String[] foods = {"김치", "두부(상함)",
                "우유", "달걀(상함)", "사과"};

        // 문자열에서 접두/접미 검사
        String test = "손흥민";
        // 손으로 시작하는지 검사 - startswith
        System.out.println(test.startsWith("손"));
        // 민으로 끝나는지 검사 - endswith
        System.out.println(test.endsWith("민"));


        for (int i = 0; i < foods.length; i++) {

            if (foods[i].contains("(상함)")) {
                continue;
            }
            System.out.println(foods[i]);
        }
    }
}
