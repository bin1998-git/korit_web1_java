package _38_Stream.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class StudentDto2 {
    private String name;
    private String major;
    private int score;
    private String emailId; // kim@secret.com -> "kim"

}
