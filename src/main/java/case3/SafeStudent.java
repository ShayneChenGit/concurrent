package case3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SafeStudent {
    private volatile String name;
    private volatile String gender;
    private volatile boolean flag;
    private volatile boolean waitFlag = false;

    public SafeStudent(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}
