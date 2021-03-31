package case2;

class Ticket {
    public int count = 60;
}

public class UnSafeThread implements Runnable{

    Ticket ticket;

    public UnSafeThread(Ticket ticket) {
        this.ticket = ticket;
    }
    @Override
    public void run() {
        while (ticket.count > 0) {
            System.out.println(Thread.currentThread().getName() + "====>" + delNum());
        }
    }

    public int delNum() {
        return this.ticket.count -= 1;
    }
}

