package Test;

public class test {

    public static int calcTotal(int kor, int eng, int math) {
        return kor + eng + math;
    }

    public static double calcAverage(int totalScore) {
        return totalScore / 3.0;
    }

    public static String getGrade(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    public static void printStudentInfo(String name, int kor, int eng, int math) {

        // 메서드 3개를 완성해서 컴파일에러를 없애주세요
        // calcTotal, calcAverage, getGrade
        // grade: 90이상 A, 80~89 B, 70~79 C, 60~69 D, 60미만 F

        // calcTotal -> 리턴: int / 매개변수: int, int, int
        int totalScore = calcTotal(kor, eng, math);
        // calcAverage -> 리턴: double / 매개변수 : int
        double average = calcAverage(totalScore);
        // getGrade -> 리턴 :double/ 매개변수 : double
        String grade = getGrade(average);

        System.out.println("이름 :" + name + "학생");
        System.out.println("총점 :" + totalScore);
        System.out.println("평균 :" + average);
        System.out.println("등급 :" + grade);
    }
    public static void main(String[] args) {
        printStudentInfo("박정빈", 100 ,80, 70);
    }
}


