import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<Integer> p = x -> x > 4545;
        System.out.println(p.test(4));
    }
}
