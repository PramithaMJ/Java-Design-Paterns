package lazyInitialization;

public class SingletonLazyTest {
   public static void main (String [] args){
         Singletonlazy lazyInstance1 = Singletonlazy.getLazyInstance();
         Singletonlazy lazyInstance2 = Singletonlazy.getLazyInstance();
    
         System.out.println(lazyInstance1);
         System.out.println(lazyInstance2); // same lazy how many times we access
   } 
}
