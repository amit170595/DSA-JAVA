import java.util.function.IntPredicate;

public class PredicateKeywordExample {
    public static void main(String[] args) {
        IntPredicate LessThen18 = i -> i < 18;
        IntPredicate MoreThen18 = i -> i > 10;
        Demo(15, LessThen18, MoreThen18);
    }

    private static void Demo(int i, IntPredicate lessThen18, IntPredicate moreThen18) {
        if (lessThen18.and(moreThen18).test(i)) {
            System.out.println("Input value is more then 10 and less then 18");
        } else {
            System.out.println("Invalid Statement");
        }
    }
}
