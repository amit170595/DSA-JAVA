public class ThrowAndReThrowDemo {
    public static void test1() throws Exception{
        System.out.println("The Exception in test1() method");
        System.out.println("Throw from test1() method");
    }
    public static void test2() throws Exception{
        try{
            test1();
        } catch(Exception e){
            System.out.println("Inside test2() method");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            test2();
        } catch(Exception e){
            System.out.println("Catch in Main");
        }
    }
}
