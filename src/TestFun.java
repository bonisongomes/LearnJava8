import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFun {
    public static void main(String[] args) {
        Function<String,Integer> getLenFunc = s -> s.length();
        System.out.println("Len = " + getLenFunc.apply("Test String"));
        Function<String,String> getSubString = s -> s.substring(0,3);
        System.out.println("Substring =" + getSubString.apply("sdsds"));

        Student s1 = new Student(101 , "Raghuvendra");
        Student s2 = new Student(102 , "Radindra");
        Student s3 = new Student(103 , "Ragvesh");
        List<Student> studentList = Arrays.asList(s1,s2,s3);

        Function<List<Student>,List<Student>> filterFunc = students -> {
            List<Student> filtStudent = new ArrayList<>();
            for(Student student : students){
                if(getSubString.apply(student.getName()).equalsIgnoreCase("Rag")){
                    filtStudent.add(student);
                }
            }
            return filtStudent;
        };

        System.out.println("Filtered Students : " + filterFunc.apply(studentList));

        Function<Integer,Integer> doubleFunc = num -> num * 2;
        Function<Integer,Integer> cubeFunc = num -> num * num * num;
        System.out.println("Double the number = " + doubleFunc.apply(4));
        System.out.println("Cube the number = " + cubeFunc.apply(3));
        System.out.println("Double andThen Cube = " + doubleFunc.andThen(cubeFunc).apply(5));
        System.out.println("Cube andThen Double = " + cubeFunc.andThen(doubleFunc).apply(5));
        System.out.println("Double compose cube = " + doubleFunc.compose(cubeFunc).apply(5));
    }
}

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
