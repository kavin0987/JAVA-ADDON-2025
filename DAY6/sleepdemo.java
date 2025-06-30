
package ClassTasks;


public class T3_SleepJoin {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Child thread working...");
                Thread.sleep(1500);          
                System.out.println("Child thread done.");
            } catch (InterruptedException ignored) {}
        });

        t.start();
        try {
            System.out.println("Main waiting for child to finish...");
            t.join();                        
        } catch (InterruptedException ignored) {}
        System.out.println("Main resumes after join.");
    }
}
