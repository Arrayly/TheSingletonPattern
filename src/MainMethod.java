public class MainMethod {

    public static void main(String[] args) {

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        LockingSingleton lockingSingleton = LockingSingleton.getInstance();
        SynchronziedSingleton synchronziedSingleton = SynchronziedSingleton.getInstance();
        System.out.println(eagerSingleton + " " + lockingSingleton + " " + synchronziedSingleton);

    }
}
