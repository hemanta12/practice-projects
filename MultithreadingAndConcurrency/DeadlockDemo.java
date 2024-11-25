
/**
 * DeadlockDemo demonstrates a scenario where two threads cause a deadlock
 * by trying to acquire locks on two resources in reverse order.
 * 
 * To solve it: avoid a deadlock by ensuring threads
 * acquire locks in a consistent order.
 */
public class DeadlockDemo {
    public static void main(String[] args) {

        // Create two shared resources
        final Object resource1 = "Resource1";
        final Object resource2 = "Resource2";

        // Thread 1 tries to lock resource1, then resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked " + resource1);

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted");
                }

                synchronized (resource2) {
                    System.out.println("Thread 1 locked " + resource2);
                }
            }
        });

        // Thread 2 tries to lock resource2, then resource1
        Thread thread2 = new Thread(() -> {
            // to see a deadlock
            // synchronized(resource2)
            synchronized (resource1) {
                System.out.println("Thread 2 locked " + resource2);

                try {
                    Thread.sleep(50); // Simulate some work
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrupted");
                }
                // to see a deadlock
                // synchronized(resource1)
                synchronized (resource2) {
                    System.out.println("Thread 2 locked " + resource1);
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

    }

}
