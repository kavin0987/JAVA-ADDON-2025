
package ClassTasks;


public class T2_MessageRunnable implements Runnable {
    private final String message;

    public T2_MessageRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " says: " + message);
    }
}
