package case3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SafeInputThread extends Thread{

    private volatile SafeStudent student;

    public void run(){
        while (true) {
            synchronized (student) {
                if(!student.isWaitFlag()){
                    try{
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "====>" + student.getName() + "----" + student.getGender());
                student.setWaitFlag(false);
                student.notify();
            }
        }
    }
}
