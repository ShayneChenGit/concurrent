package case3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {
    private String name;
    private String gender;
    private boolean flag;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}
