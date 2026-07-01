package course.staticpkg;

public class FlightTicket {
    public int flightNumber;
    public int seatNumber;
    public String ticketCategory;
    public int ticketID;

    public static int availableSeats = 2;


    public FlightTicket(int flightNumber, int seatNumber, String ticketCategory, int ticketID){
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketCategory = ticketCategory;
        this.ticketID = ticketID;
    }

    public static void main(String[] args){
        createTicket();
        // System.out.println("Avaialble Seats is : " +availableSeats);

        FlightTicket ticket2 = new FlightTicket(1222, 2, "Economy", 123456);
        availableSeats--;
        //System.out.println("Avaialble Seats is : " +availableSeats);

        FlightTicket ticket3 = new FlightTicket(1223, 3, "Business", 14325);
        availableSeats--;


    }

    private static void createTicket() {
        if (availableSeats>0) {
            FlightTicket ticket1 = new FlightTicket(1122,1, "Economy", 12345);
            availableSeats--;//ticket1.availableSeats--;
            System.out.println("Avaialble Seats is : " +availableSeats);
        } else {
            System.out.println("Sorry Tickets not available");
        }
    }
}
