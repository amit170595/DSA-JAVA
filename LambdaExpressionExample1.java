public class LambdaExpressionExample1 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("I am in Thread");
            System.out.println("I am in Line 2");
        }).start();
    }
}
