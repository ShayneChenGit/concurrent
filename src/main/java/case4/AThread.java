package case4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AThread implements Runnable{
    Res res;

    @Override
    public void run() {
        while (true){
            for(int i=1; i<=100; i++){
                synchronized (res) {
                    if(res.flag) {
                        try{
                            res.wait();
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(i%2==1) {
                        System.out.println(Thread.currentThread().getName() + "====奇数" +i);
                    }
                    res.flag =true;
                    res.notify();

                }
            }
            break;
        }
    }
}
