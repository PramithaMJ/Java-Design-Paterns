package staticBlockInitialization;
public class SingletonStaticBolck {
    private static SingletonStaticBolck instance;

    static {
        instance = new SingletonStaticBolck();
    }

    private SingletonStaticBolck() {

    }

    public static SingletonStaticBolck getInstance() {
        return instance;
    }
}
