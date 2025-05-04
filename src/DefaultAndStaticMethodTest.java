interface Parent{
    default void sayHello() {
        System.out.println("Parent says Hello!");
    }

    static void sayBye() {
        System.out.println("Bye Parent");
    }
}

interface Child extends Parent{
    @Override
    default void sayHello() {
        System.out.println("Child Says Hello!");
    }
}

public class DefaultAndStaticMethodTest implements Child{
    public static void main(String[] args) {
        Child d = new DefaultAndStaticMethodTest();
        d.sayHello();
        Parent.sayBye();
    }
}
