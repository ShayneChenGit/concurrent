package case3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OutputThread extends Thread{

    private Student student;

    public void run(){
        while (true){
            synchronized (student) {
                if(student.isFlag()){
                    student.setGender("boy");
                    student.setName("tom");
                    student.setFlag(false);
                } else {
                    student.setGender("girl");
                    student.setName("alice");
                    student.setFlag(true);
                }
            }
        }
    }
}
