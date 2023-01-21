public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Started with runnable interface  ....");
    }

    public static void main(String[] args) {
        ThreadWithRunnable threadWithRunnable =  new ThreadWithRunnable();
        Thread t1 =  new Thread(new ThreadWithRunnable());
        Thread t2 =  new Thread(new ThreadWithRunnable());
        t1.start();
        t2.start();
    }


}
