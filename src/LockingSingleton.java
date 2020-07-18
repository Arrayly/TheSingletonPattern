public class LockingSingleton {

    private volatile static LockingSingleton instance;

    private LockingSingleton() { }


    /**
     * Use synchronized block inside the if loop and volatile variable
     *
     * Pros:
     *
     *     - Thread safety is guaranteed
     *     - Client application can pass arguments
     *     - Lazy initialization achieved
     *     - Synchronization overhead is minimal and applicable only for first few threads when the variable is null.
     *
     * Cons:
     *
     *     - Extra if condition
     *
     * @return instance
     */
    public static LockingSingleton getInstance(){
        synchronized (LockingSingleton.class){
            if (instance == null){
                instance = new LockingSingleton();
            }
        }
        return instance;
    }

}
