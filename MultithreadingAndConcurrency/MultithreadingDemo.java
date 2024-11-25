/**
 * MyThread class demonstrates how to create a thread by extending the Thread
 * class.
 * It defines a specific task to be executed concurrently by overriding the
 * run() method.
 * 
 * Use this approach when task logic is closely tied to the thread's lifecycle.
 */
class MyThread extends Thread {

    /**
     * The run() method contains the logic to be executed by the thread.
     * In this example, the thread prints numbers from 1 to 5 with a delay,
     * simulating a periodic task like status updates.
     */
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupeted");
            }
        }
    }

}

/**
 * MyRunnable class demonstrates how to create a thread by implementing the
 * Runnable interface.
 * This is a preferred approach when you want to separate task logic from thread
 * management.
 * It allows greater flexibility since the class does not need to extend Thread.
 */
class MyRunnable implements Runnable {
    /**
     * The run() method defines the logic that will execute in the thread.
     * This implementation prints numbers from 1 to 5 with a delay, simulating
     * a task such as processing items in a queue.
     */
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("MyRunnable running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MyRunnable Interrupted");
            }

        }
    }
}

/**
 * MultithreadingDemo demonstrates the use of both `Thread` and `Runnable`
 * to create and execute threads in a concurrent environment.
 * 
 * This example shows how both approaches can coexist and highlights their
 * differences.
 */
public class MultithreadingDemo {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        // Main thread executes its own task, demonstrating concurrent execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread running: " + i);
            try {
                Thread.sleep(500);// Pause for 500ms to simulate work
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}