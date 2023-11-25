package eagerInitialization;
public class SingletonEgerTest {

    public static void main(String [] args) {
        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2); // same eager how many times we access
    }
}