@FunctionalInterface
public interface MyChildInterace extends MyFunctionalInterface{
    public void getData();

    @Override
    default void setData() {
        System.out.println("Setting default data");
    }
}
