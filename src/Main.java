public class Main {
    public static void main(String[] args) {
        MyEmp emp = new MyEmp();
        emp.setData();
        emp.getData();
        MyFunctionalInterface myFunctionalInterface = new MyEmp();
        System.out.println("Using interface object");
        myFunctionalInterface.setData();
        myFunctionalInterface.getData();

        MyFunctionalInterface myFunctionalInterface1 = new MyChildInterace() {
            @Override
            public void getData() {
                System.out.println("Calling getData via interface");
            }
        };
        myFunctionalInterface1.getData();
        myFunctionalInterface1.setData();
    }
}