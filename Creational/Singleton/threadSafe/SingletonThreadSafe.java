package threadSafe;

public class SingletonThreadSafe {
    
    private static SingletonThreadSafe threadsafeinstance;
    
    private SingletonThreadSafe() {
        
    }
    
    public static  SingletonThreadSafe getinstance() {
        synchronized(SingletonThreadSafe.class){
            if (threadsafeinstance == null) {
                threadsafeinstance = new SingletonThreadSafe();
            }
        }
        return threadsafeinstance;
    }
}
