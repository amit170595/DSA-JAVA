class Gener<T> {
    T ob;

    Gener(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

public class Generics {
    public static void main(String[] args) {
        Gener<Integer> iob = new Gener<>(88);
        int v = iob.getob();
        System.out.println(v);
        Gener<String> strob = new Gener<>("Generics Test");
        String str = strob.getob();
        System.out.println(str);
    }
}
