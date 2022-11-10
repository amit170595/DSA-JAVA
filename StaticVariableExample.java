public class StaticVariableExample {
    public static void main(String[] args) {
        System.out.println("Current variable value: "+StaticTest.getStaticVariable());
        StaticTest.setStaticVariable(1);
        System.out.println("Current variable value: "+StaticTest.getStaticVariable());
        StaticTest.setStaticVariable(24);
        System.out.println("Current variable value: "+StaticTest.getStaticVariable());
     }
}
class StaticTest {
	private static int staticVariable=0;
	public static int getStaticVariable() {
		return staticVariable;
	}
	public static void setStaticVariable(int staticVariable) {
		StaticTest.staticVariable = staticVariable;
	}
}
