package case4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BThread implements Runnable{
    Res res;

    @Override
    public void run() {
        while (true){
            for(int i=1; i<=100; i++){
                synchronized (res){
                    if(!res.flag){
                        try{
                            res.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName() + "====偶数" +i);
                    }
                    res.flag = false;
                    res.notify();
                }
            }
            break;
        }
    }
}
