public class TrainTicketBooking {
    private static final int TOTAL_SEATS = 10;
    private boolean[] seats = new boolean[TOTAL_SEATS];

    public synchronized boolean bookSeat(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= TOTAL_SEATS) {
            System.out.println("Invalid seat number.");
            return false;
        }
        if (seats[seatNumber]) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return false;
        }
        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " successfully booked.");
        return true;
    }
}