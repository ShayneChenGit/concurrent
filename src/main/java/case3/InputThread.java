package case3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InputThread extends Thread{

    private Student student;

    public void run() {
        while(true) {
            synchronized (student) {
                System.out.println(Thread.currentThread().getName()+"====>" + student.getName() + "---" + student.getGender());
            }
        }
    }

}
