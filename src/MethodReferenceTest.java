import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Hanley");
//        names.forEach(s -> print(s));
        names.forEach(MethodReferenceTest::print);

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        List<Integer> nums = Arrays.asList(34,10,12,45);
        nums.forEach(methodReferenceTest::multiply);

        Map<Integer,Integer> map = new HashMap<>();
        map.put(101,45);
        map.put(102,68);
        map.put(103,95);
        map.forEach(methodReferenceTest::printIfPass);

//        List<Students> students = names.stream().map(s -> new Students(s)).collect(Collectors.toList());
        List<Students> students = names.stream().map(Students::new).collect(Collectors.toList());
        System.out.println(students);
    }

    private void printIfPass(int id,int marks) {
        if(marks > 50){
            System.out.println("student with id : " + id +" passed");
        }
        else{
            System.out.println("student with id : " + id +" failed");
        }
    }


    public static void print(String s){
        System.out.println(s);
    }
    public void multiply(int x){
        int y = 3;
        System.out.println("muliplied result : " + x*y);
    }
}
