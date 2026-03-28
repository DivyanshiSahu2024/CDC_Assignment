package SystemDesign.SingletonDesignPattern;

public class ThreadSafeLockingSingleton {

    private static ThreadSafeLockingSingleton instance=null;

    private ThreadSafeLockingSingleton(){
        System.out.println("Sinleton Constructor called. New Object created");
    }

    public static ThreadSafeLockingSingleton getInstance(){
        synchronized (ThreadSafeLockingSingleton.class) {//Lock for Thread Safety
        if(instance==null){
           instance= new ThreadSafeLockingSingleton();
        }
        return instance;
    }
    }
     public static void main(String [] args){
        ThreadSafeLockingSingleton s1=ThreadSafeLockingSingleton.getInstance();
        ThreadSafeLockingSingleton s2=ThreadSafeLockingSingleton.getInstance();

        System.out.println(s1==s2);

    }
}
