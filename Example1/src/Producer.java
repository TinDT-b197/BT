public class Producer extends Thread {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                while (store.full()) {
                    try {
                        store.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                store.put(System.currentTimeMillis());
                store.notifyAll();
            }
        }
    }
}