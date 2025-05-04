import java.util.Comparator;

public class MyComparatorImpl implements Comparator<Character> {
    @Override
    public int compare(Character a, Character b) {
        return (int)b- (int)a;
    }
}
