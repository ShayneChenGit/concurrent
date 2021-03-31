package case3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SafeOutputThread extends Thread{

    private SafeStudent student;

    public void run() {
        while(true){
            synchronized (student) {
                if(student.isWaitFlag()) {
                    try{
                        student.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                if(student.isFlag()){
                    student.setGender("boy");
                    student.setName("tom");
                    student.setFlag(false);
                } else {
                    student.setGender("girl");
                    student.setName("alice");
                    student.setFlag(true);
                }

                student.setWaitFlag(true);
                student.notify();
            }
        }
    }

}
