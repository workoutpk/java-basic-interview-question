public class Multi3Example implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Multi3Example m1=new Multi3Example();
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }

}
