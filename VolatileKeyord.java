public class VolatileKeyord {
    volatile public static int flag = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (flag == 0)
                        System.out.println("Running");
                    else
                        break;
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                flag = 1;
                System.out.println("Flag value updated");
            }
        }).start();
    }
}
