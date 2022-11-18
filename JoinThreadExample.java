public class JoinThreadExample {
    public int count = 0;

    public static void main(String[] args) {
        JoinThreadExample app = new JoinThreadExample();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    app.count++;
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000; i++) {
                    app.count++;
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value of the Count: " + app.count);
    }
}
