class PreGen {
    Object ob;

    PreGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }
}

public class PreGenerics {
    public static void main(String[] args) {
        PreGen iob = new PreGen(88);
        int v = (Integer) iob.getob();
        System.out.println(v);
        PreGen strob = new PreGen("Pre-Generics Code");
        String str = (String) strob.getob();
        System.out.println(str);
    }
}
