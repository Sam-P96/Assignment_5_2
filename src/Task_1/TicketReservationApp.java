package Task_1;

import java.util.Random;

public class TicketReservationApp {
    public static void main(String[] args) throws InterruptedException {
        Theater theater = new Theater(10);
        Random random = new Random();
        Customer[] customers = new Customer[15];

        for (int i = 0; i < customers.length; i++) {
            int seats = random.nextInt(3) + 1;
            customers[i] = new Customer(i + 1, seats, theater);
        }


        for (Customer c : customers) {
            c.start();
        }

        System.out.println("All reservations processed. Seats left: " + theater.getAvailableSeats() + " / " + theater.getCapacity());
    }
}
