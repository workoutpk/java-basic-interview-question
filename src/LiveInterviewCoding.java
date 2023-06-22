public class LiveInterviewCoding implements Runnable {
        public static void main(String[] args) {
                LiveInterviewCoding liveInterviewCoding = new LiveInterviewCoding();
                for (int i = 0; i < 10; i++) {
                        Thread t1 = new Thread(new LiveInterviewCoding());
                        t1.start();
                }


        }

        public void run() {
                try {
                        System.out.println("this is pk ..." + Thread.currentThread().getName() +
                            " | " + Thread.currentThread().getId());
                } catch (Exception e) {
                        System.out.println("Exception ::" + e);
                }

        }
}
