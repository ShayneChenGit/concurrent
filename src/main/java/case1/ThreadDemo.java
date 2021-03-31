package case1;

import java.util.ArrayList;
import java.util.List;

/**
 * 发送用户10W邮件,如何多线程提高效率
 */

public class ThreadDemo {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        for(int i=0; i<92; i++){
            objects.add(i);
        }

        List<List<Object>> lists = ListUtils.splitList(objects, 10);

        for(List<Object> list: lists){
            Message message = new Message(list);
            new Thread(message).start();
        }
    }
}
