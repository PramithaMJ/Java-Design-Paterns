package billPugh;

class SingleTonBillPughTest {

    public static void main(String[] args) {
        SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh instance2 = SingletonBillPugh.getInstance();

        System.out.println("Instance 1 hash: " + instance1.hashCode());
        System.out.println("Instance 2 hash: " + instance2.hashCode());
    }
}