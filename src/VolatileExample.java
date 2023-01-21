public class VolatileExample extends Thread {
    // using volatile
    volatile boolean working = true;

    // if non-volatile it will
    // sleep in main and
    // runtime error will coocur
    public void run()
    {
        long count = 0;
        while (working) {
            count++;
        }

        System.out.println("Thread terminated." + count);
    }


    // Driver code
    public static void main(String[] args)throws InterruptedException
    {
        VolatileExample test = new VolatileExample();
        test.start();
        Thread.sleep(100);
        System.out.println("After Sleeping in Main");
        test.working = false;
        test.join();
        System.out.println("Working set to "
                + test.working);
    }
}
