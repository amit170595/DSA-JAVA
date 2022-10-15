class ChildGettingSettingNameThread extends Thread {
}

public class GettingSettingNameThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ChildGettingSettingNameThread ct = new ChildGettingSettingNameThread();
        System.out.println(ct.getName());
        ct.start();
        Thread.currentThread().setName("PrepBytes");
        System.out.println(Thread.currentThread().getName());
    }
}