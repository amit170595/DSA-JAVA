class NonGen {
    int a, b;

    NonGen(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getMax() {
        return Math.max(a, b);
    }
}

public class NonGenerics {
    public static void main(String[] args) {
        NonGen ng = new NonGen(5, 6);
        System.out.println(ng.getMax());
    }
}
