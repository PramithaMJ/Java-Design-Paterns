package lazyInitialization;

public class Singletonlazy {

    private static Singletonlazy lazyInstance;

    private Singletonlazy() {

    }

    public static Singletonlazy getLazyInstance() {
        if (lazyInstance == null) {
            lazyInstance = new Singletonlazy();
        }
        return lazyInstance;
    }

}
