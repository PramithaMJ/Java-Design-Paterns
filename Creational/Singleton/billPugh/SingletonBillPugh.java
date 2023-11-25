package billPugh;

public class SingletonBillPugh {
    private SingletonBillPugh(){

    }

    private static class InnerSingletonBillPugh {
        private static final SingletonBillPugh billPughInstance = new SingletonBillPugh();    
    }

    public static SingletonBillPugh getInstance() {
        return InnerSingletonBillPugh.billPughInstance;
    }
}
