import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Pred {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> arrList = Arrays.asList(34,55,32,67,61,44);
        System.out.println(isEven.test(4545));
        int sum = 0;
        for(Integer num : arrList){
            if(isEven.test(num)){
                sum += num;
            }
        }
        System.out.println(sum);

        Predicate<String> startWith = s -> s.toUpperCase().startsWith("G");
        Predicate<String> contains = s -> s.toUpperCase().contains("M");
        //Predicate<String> andPred = startWith.and(contains);
        System.out.println(startWith.test("g"));
        System.out.println(contains.test("eremr"));
        System.out.println("And test :" + startWith.and(contains).test("gremer"));

        Predicate<Student> studentPredicate = student -> student.getSid() > 3;
        Student s1 = new Student(4,"DFDF");
        System.out.println(studentPredicate.test(s1));
    }

    public static class Student{
        int sid;
        String name;

        public Student(int sid, String name) {
            this.sid = sid;
            this.name = name;
        }

        public int getSid() {
            return sid;
        }

        public void setSid(int sid) {
            this.sid = sid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
