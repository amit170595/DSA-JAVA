public class LocalInnerClassExampleDoor {
    public static void main(String[] args) {
        Door1 door = new Door1();
        System.out.println(door.isLocked("Test"));
    }
}

class Door1 {
    public boolean isLocked(String key) {
        class Lock {
            public boolean isLocked(String key) {
                if (key.equals("qwerty"))
                    return false;
                else
                    return true;
            }
        }
        return new Lock().isLocked(key);
    }
}
