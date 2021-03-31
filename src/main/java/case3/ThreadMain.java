package case3;

public class ThreadMain {
    public static void main(String[] args) {
        Student student = new Student();
        new OutputThread(student).start();
        new InputThread(student).start();


        //safe

        SafeStudent safeStudent = new SafeStudent();
        new SafeOutputThread(safeStudent).start();
        new SafeInputThread(safeStudent).start();
    }
}
