package Task_1;

public class Customer extends Thread {
    private final int customerId;
    private final int seatsWanted;
    private final Theater theater;

    public Customer(int customerId, int seatsWanted, Theater theater) {
        this.customerId = customerId;
        this.seatsWanted = seatsWanted;
        this.theater = theater;
    }

    @Override
    public void run() {
        theater.reserve(customerId, seatsWanted);
    }

}
