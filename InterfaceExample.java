public class InterfaceExample {
    public static void main(String[] args) {
        Phone phone = new OnePLus();
        System.out.println(phone.processor());
        System.out.println(phone.os());
        System.out.println(phone.spaceInGB());
    }
}

interface Phone {
    String processor();

    String os();

    int spaceInGB();
}

class Iphone implements Phone {
    @Override
    public String processor() {
        return "A13";
    }

    @Override
    public String os() {
        return "IOS";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }
}

class OnePLus implements Phone {
    @Override
    public String processor() {
        return "SD888";
    }

    @Override
    public String os() {
        return "Android";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }
}