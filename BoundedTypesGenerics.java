class Gen<T extends Number> {
    T a;

    Gen(T a) {
        this.a = a;
    }

    void printTypes() {
        System.out.println(a.getClass().getName());
    }
}

public class BoundedTypesGenerics {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<>(6);
        gen.printTypes();
        Gen<Double> gen2 = new Gen<>(6.6);
        gen2.printTypes();
    }
}
