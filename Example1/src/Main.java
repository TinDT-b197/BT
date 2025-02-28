public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);

        producer.start();

        // Simulate customers buying bread
        new Thread(() -> {
            while (true) {
                long bread = store.get();
                System.out.println("Customer bought bread: " + bread);
                try {
                    Thread.sleep(1000); // Simulate time between purchases
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}