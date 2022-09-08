public class WrapperClass {
    public static void main(String[] args) {
        String str = "123456";
        int a = Integer.parseInt(str); // Wrapper class
        System.out.println(a + 1);
        int b = Integer.valueOf(str); // Wrapper class
        System.out.println(b + 2);
    }
}
