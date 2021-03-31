package case1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Message implements Runnable {

    private List<Object> lists;

    private Logger logger = LoggerFactory.getLogger(Message.class);

    public Message(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public void run() {
        for (int i = 0; i < lists.size(); i++) {
            logger.info(Thread.currentThread().getName() + ": send mail" + lists.get(i));
        }
    }
}
