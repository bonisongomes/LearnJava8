public class LambdaExpressionTest {
    public static void main(String[] args) {
        Employee age = () -> 34;
        System.out.println(age.getAge());

        MyTestRunnable myTestRunnable = new
                MyTestRunnable();
        Thread thread = new Thread(myTestRunnable);
        thread.run();
        System.out.println("Testing runnable");

        Runnable runnable = () -> {
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println("Functional Interface with Lambda exp run " + i);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.run();
    }
}
