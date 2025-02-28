public class Main {
    public static void main(String[] args) {
        TrainTicketBooking bookingSystem = new TrainTicketBooking();

        // Simulate customers booking seats
        Runnable customer1 = () -> bookingSystem.bookSeat(3);
        Runnable customer2 = () -> bookingSystem.bookSeat(3);
        Runnable customer3 = () -> bookingSystem.bookSeat(5);

        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);
        Thread t3 = new Thread(customer3);

        t1.start();
        t2.start();
        t3.start();
    }
}
