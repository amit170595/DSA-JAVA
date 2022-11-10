public class InnerClassExampleShop {
    public static void main(String[] args) {
        Door door = new Door();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();
    }
}

class Door {
    private Lock lock;

    public Door() {
        lock = new Lock(true);
    }

    Lock getLock() {
        return lock;
    }

    public void shopStatus() {
        if (lock.isLock())
            System.out.println("Shop is closed. Please visite later");
        else
            System.out.println("Welcome, we are open");
    }

    class Lock {
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}