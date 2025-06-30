
package ClassTasks;


import java.util.concurrent.atomic.AtomicInteger;

public class T4_TicketBooking {
    private static final int TOTAL_SEATS = 5;
    private final AtomicInteger seatsLeft = new AtomicInteger(TOTAL_SEATS);

    public static void main(String[] args) {
        T4_TicketBooking system = new T4_TicketBooking();
        for (int i = 1; i <= 7; i++) {                 
            new Thread(system::bookSeat, "User-" + i).start();
        }
    }

    private void bookSeat() {
        synchronized (this) {                         
            if (seatsLeft.get() <= 0) {
                System.out.println(Thread.currentThread().getName() + " → No seats left.");
                return;
            }
            System.out.println(Thread.currentThread().getName() + " checking seat...");
            try { Thread.sleep(300); } catch (InterruptedException ignored) {}
            seatsLeft.decrementAndGet();
            System.out.println(Thread.currentThread().getName()
                    + " booked successfully. Seats remaining: " + seatsLeft.get());
        }
    }
}
