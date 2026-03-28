package SystemDesign.SingletonDesignPattern;

public class ThreadSafeDoubleLocking {
    private static ThreadSafeDoubleLocking instance=null;

    private ThreadSafeDoubleLocking(){
        System.out.println("Sinleton Constructor called. New Object created");
    }

    public static ThreadSafeDoubleLocking getInstance(){
        if (instance==null){// First check (no locking)
            synchronized (ThreadSafeDoubleLocking.class) {// Lock only if needed
             if(instance==null){ // Second check (after acquiring lock)
                instance= new ThreadSafeDoubleLocking();
                }
            }
        }
        return instance;
    }
    public static void main(String [] args){
        ThreadSafeDoubleLocking s1=ThreadSafeDoubleLocking.getInstance();
        ThreadSafeDoubleLocking s2=ThreadSafeDoubleLocking.getInstance();

        System.out.println(s1==s2);

    }
}
