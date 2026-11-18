package Task_2;

public class ThreadSafeListTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeList<Integer> list = new ThreadSafeList<>();

        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) list.add(i); });
        Thread t2 = new Thread(() -> { for (int i = 1000; i < 2000; i++) list.add(i); });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Size added: " + list.size()); // expect 2000

        Thread t3 = new Thread(() -> { for (int i = 0; i < 1000; i++) list.remove(i); });
        Thread t4 = new Thread(() -> { for (int i = 1000; i < 2000; i++) list.remove(i); });
        t3.start(); t4.start();
        t3.join(); t4.join();
        System.out.println("Size removed: " + list.size()); // expect 0
    }
}
