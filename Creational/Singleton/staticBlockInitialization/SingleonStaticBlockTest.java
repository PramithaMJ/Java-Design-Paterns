package staticBlockInitialization;

public class SingleonStaticBlockTest {

    public static void main(String [] args) {
        SingletonStaticBolck staticBlockInstance1 = SingletonStaticBolck.getInstance();
        SingletonStaticBolck staticBlockInstance2 = SingletonStaticBolck.getInstance();

        System.out.println(staticBlockInstance1);
        System.out.println(staticBlockInstance2); // same staticBlock how many times we access
    }
}
