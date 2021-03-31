package case4;

public class ThreadMain {
    public static void main(String[] args) {
        Res res = new Res();
        AThread aThread = new AThread(res);
        BThread bThread = new BThread(res);
        new Thread(aThread,"a").start();
        new Thread(bThread,"b").start();

    }
}
