public class SynchronizedThreadDemo {
    public static void main(String[] args) {
        // AnimalNames name = new AnimalNames();
        // MyThread t1 = new MyThread(name, "Cat");
        // MyThread t2 = new MyThread(name, "Dog");
        // t1.start();
        // t2.start();

        AnimalNames aname = new AnimalNames();
        AnimalNames bname = new AnimalNames();
        MyThread t1 = new MyThread(aname, "Cat");
        MyThread t2 = new MyThread(bname, "Dog");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    AnimalNames an;
    String name;

    MyThread(AnimalNames an, String name) {
        this.an = an;
        this.name = name;
    }

    public void run() {
        try {
            an.printName(name);
        } catch (InterruptedException e) {
        }
    }
}

class AnimalNames {
    synchronized void printName(String name) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Animal Name is: " + name);
            Thread.sleep(1000);
        }
    }
}