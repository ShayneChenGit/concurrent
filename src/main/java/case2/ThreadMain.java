package case2;

public class ThreadMain {
    public static void main(String[] args) {

        // unsafe
        Ticket ticket = new Ticket();

        UnSafeThread unSafeThread = new UnSafeThread(ticket);
        new Thread(unSafeThread, "aa").start();
        new Thread(unSafeThread, "bb").start();

        // safe
        Ticket2 ticket2 = new Ticket2();

        SafeThread safeThread = new SafeThread(ticket2);
        new Thread(safeThread, "cc").start();
        new Thread(safeThread, "dd").start();
    }
}
