public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ChildJoinDemo cj = new ChildJoinDemo();
        cj.start();
        cj.join();
        for (int i = 0; i < 1000; i++)
            System.out.println("Main Thread " + i);
    }
}

class ChildJoinDemo extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println("Child Thread " + i);
    }
}