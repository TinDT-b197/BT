public class Store {
    int maxN = 50;
    long[] a;
    int n;

    public Store() {
        n = 0;
        a = new long[maxN];
    }

    private boolean empty() {
        return n == 0;
    }

    public boolean full() {
        return n == maxN;
    }

    public synchronized boolean put(long x) {
        if (full()) {
            return false;
        }
        a[n++] = x;
        notifyAll();
        return true;
    }

    public synchronized long get(){
        while(empty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        long x = a[--n];
        notifyAll();
        return x;
    }
}