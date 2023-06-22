package src;

public class RunningTestExample {
        public static void main(String[] args) {
                System.out.println("Hello this is  pk");
        }

        public static class ClassNotFoundExceptionExample {
                private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

                public static void main(String[] args) throws Exception {
                        System.out.println("Loading MySQL JDBC driver");
                        Class.forName(DRIVER_CLASS);
                }
        }
}
