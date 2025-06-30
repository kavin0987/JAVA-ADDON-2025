
package ClassTasks;


public class T1_PrintNumbersThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " : " + i);
            
            try {                     
                sleep(100);
            } catch (InterruptedException ignored) {}
        }
    }

    
    public static void main(String[] args) {
        new T1_PrintNumbersThread().start();
    }
}
