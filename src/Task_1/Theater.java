package Task_1;

public class Theater {
    private final int capacity;
    private int availableSeats;

    public Theater(int capacity) {
        this.capacity = capacity;
        this.availableSeats = capacity;
    }

    public synchronized boolean reserve(int customerId, int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println("Customer " + customerId + " reserved " + seats + " seats(s). Seats left: " + availableSeats);
            return true;
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + seats + " seats(s). Only " + availableSeats + "left.");
            return false;
        }
    }

    public synchronized int getAvailableSeats() {
        return availableSeats;
    }

    public int getCapacity() {
        return capacity;
    }

}
