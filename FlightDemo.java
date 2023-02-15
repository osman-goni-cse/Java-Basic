class Flight {
    private static final int TOTAL_SEATING_CAPACITY = 2;
    private int totalCheckedBags;
    private int totalPassengers;

    public void addOnePassenger(int bags, int carryOns) {
        int totalBags = bags;
        if (carryOns > 2) {
            totalBags = bags + carryOns - 2;
        }
        addOnePassenger(totalBags);
    }

    public void addOnePassenger(int bags) {
        if (isSeatAvailable()) {
            addOnePassenger();
            totalCheckedBags += bags;
        }
        else {
            System.out.println("Seat is not available");
        }
    }

    public void addOnePassenger() {
        if (isSeatAvailable()) {
            totalPassengers += 1;
        }
        else {
            System.out.println("Seat is not available");
        }
    }

    public boolean isSeatAvailable() {
        return totalCheckedBags < TOTAL_SEATING_CAPACITY;
    }

    public int getTotalCheckedBags() {
        return this.totalCheckedBags;
    }

    public int getTotalPassengers() {
        return this.totalPassengers;
    }
}
public class FlightDemo {
    public static void main(String[] args) {
        System.out.println("US-Bangla Airlines");

        Flight flight = new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(2);
        flight.addOnePassenger(3, 4);

        System.out.println("Total Checked Bags " + flight.getTotalCheckedBags());
        System.out.println("Total Passengers " + flight.getTotalPassengers());
    }
}
