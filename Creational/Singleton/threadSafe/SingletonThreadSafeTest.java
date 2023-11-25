package threadSafe;

public class SingletonThreadSafeTest {
    
        public static void main(String[] args) {
            SingletonThreadSafe instance1 = SingletonThreadSafe.getinstance();
            SingletonThreadSafe instance2 = SingletonThreadSafe.getinstance();
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        }
}
