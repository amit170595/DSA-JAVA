public class YieldDemo {
    public static void main(String[] args) {
        ChildYieldDemo ct= new ChildYieldDemo();
        ct.start();
        for(int i=0;i<100;i++){
            System.out.println("Main Yield: "+i);
            Thread.yield();
        }
    }
}

class ChildYieldDemo extends Thread{
    public void run(){
        for(int i=0;i<100;i++)
            System.out.println("Child Yield: "+i);
    }
}