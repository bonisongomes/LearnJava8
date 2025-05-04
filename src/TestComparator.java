import java.util.*;
import java.util.function.IntBinaryOperator;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(89);
        lst.add(45);
        lst.add(101);
        lst.add(20);
//        Collections.sort(lst,new MyComparatorImpl());
        Collections.sort(lst,(a,b) -> b - a);
        System.out.println(lst);

        Set<Integer> mySet = new TreeSet<>((a,b) -> a - b);
        mySet.add(90);
        mySet.add(34);
        mySet.add(45);
        System.out.println(mySet);

        ArrayList<Counterparty> counterpartyArrayList = new ArrayList<>();
        counterpartyArrayList.add(new Counterparty(44,"BOB","Mumbai"));
        counterpartyArrayList.add(new Counterparty(92,"SBI","Delhi"));
        counterpartyArrayList.add(new Counterparty(22,"Axis","Chennai"));
        Collections.sort(counterpartyArrayList,(a,b) -> b.c_id - a.c_id);
        System.out.println(counterpartyArrayList);

        ArrayList<String> strlst = new ArrayList<>();
        strlst.add("Raju");
        strlst.add("Sham");
        strlst.add("Priya");
        strlst.add("Anaa");
//        Collections.sort(lst,new MyComparatorImpl());
        Collections.sort(strlst,(a,b) -> (int) b.charAt(0) - (int) a.charAt(0));
//        strlst.sort((a, b) -> (int) b.charAt(0) - (int) a.charAt(0));

        System.out.println(strlst);
    }
}
