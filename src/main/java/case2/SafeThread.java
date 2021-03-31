package case2;

import java.util.concurrent.atomic.AtomicInteger;

class Ticket2 {
    public AtomicInteger count = new AtomicInteger(60);
}
public class SafeThread implements Runnable{

    Ticket2 ticket2;

    public SafeThread(Ticket2 ticket2) {
        this.ticket2 = ticket2;
    }

    @Override
    public void run() {
        while (ticket2.count.get() > 0){
            System.out.println(Thread.currentThread().getName()+"====>" + ticket2.count.decrementAndGet());
        }
    }
}
