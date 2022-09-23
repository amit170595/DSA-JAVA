import java.util.HashMap;
import java.util.WeakHashMap;

class Temp {
    public int intValue() {
        return 1;
    }
}

public class WeakHashSetExample {
    public static void main(String[] args) throws InterruptedException {
        Temp t = new Temp();
        HashMap m1 = new HashMap();
        m1.put(t, "IronMan");
        t = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(m1);
        Temp t2 = new Temp();
        WeakHashMap m2 = new WeakHashMap();
        m2.put(t2, "IronMan");
        t2 = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(m2);
    }
}
