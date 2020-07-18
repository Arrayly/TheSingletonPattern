public class SynchronziedSingleton {

    private static SynchronziedSingleton instance;

    private SynchronziedSingleton() { }

    /**
     * Synchronize the getInstance() method.
     *
     * Pros:
     *
     *     - Thread safety is guaranteed.
     *     - Client application can pass parameters
     *     - Lazy initialization achieved
     *
     * Cons:
     *
     *     - Slow performance because of locking overhead.
     *     - Unnecessary synchronization that is not required once the instance variable is initialized.
     *
     * @return instance
     */
    public static synchronized SynchronziedSingleton getInstance(){
        if (instance == null){
            instance = new SynchronziedSingleton();
        }
        return instance;
    }

}
