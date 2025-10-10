package basic;

public class main71 {
    public static void main(String[] args) {
        myRunnable myRunnable=new myRunnable();
        Thread thread1=new Thread(myRunnable);
        Thread thread2=new Thread(myRunnable);

        thread1.start();
        thread2.start();
    }
}

class myRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread id : "+Thread.currentThread().threadId()+" "+i);
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println("error "+e);
            }
        }
    }
}
