public class SleepThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread " + (i + 1));
            Thread.sleep(3000);
        }
    }
}
