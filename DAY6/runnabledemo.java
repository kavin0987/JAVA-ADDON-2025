
package ClassTasks;

public class T2_RunnableDemo {
    public static void main(String[] args) {
        Runnable task = new T2_MessageRunnable("Hello from a Runnable!");
        for (int i = 0; i < 3; i++) {
            new Thread(task, "Worker-" + i).start();
        }
    }
}
