package _38_Stream.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name; // 이름
    private String major; // 전공
    private int score;
    private String phoneNumber;
    private String email;

    // dto로 변환하는 메서드를 정의
    public StudentDTO toDto() {
        String grade;
        if (this.score >= 90) grade = "A";
        else if (this.score >= 80) grade ="B";
        else if (this.score >= 70) grade = "C";
        else grade = "F";

        return StudentDTO.builder()
                .grade(grade)
                .name(this.name)
                .major(this.major)
                .build();

    }

    public StudentDto2 toDto2() {
       int indexOfAt = this.email.indexOf("@");
       String emailId = this.email.substring(0, indexOfAt);

            return  StudentDto2.builder()
                    .name(this.name)
                    .major(this.major)
                    .score(this.score)
                    .emailId(emailId)
                    .build();

    }
}
