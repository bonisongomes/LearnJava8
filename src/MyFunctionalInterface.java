@FunctionalInterface
public interface MyFunctionalInterface {
    public void getData();
    default void setData(){};
    public static void setStatData(){
        System.out.println("Understanding Functional Interface");
    }

}
