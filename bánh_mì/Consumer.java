package bánh_mì;

class Consumer extends Thread {
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            store.get();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
