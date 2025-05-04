import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
        System.out.println("UpperCase : " + unaryOperator.apply("data"));
        BinaryOperator<Integer> multiply = (x , y) -> x*y;
        System.out.println("Multiply : " + multiply.apply(34,23));
    }
}
