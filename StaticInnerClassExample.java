public class StaticInnerClassExample {
    public static void main(String[] args) {
        Outer.Inner.testingInnerMethod();
        System.out.println(Outer.Inner.x);
    }
}
class Outer{
    public static class Inner {
        public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}
}