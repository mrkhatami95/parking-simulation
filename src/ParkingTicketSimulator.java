/**
 * Created by MR on 1/26/2020.
 */
public class ParkingTicketSimulator {
    public static void main(String[] args) {

        // A green car was parked for 125 minutes
        ParkedCar car = new ParkedCar("Toyota", "2005",
                "GREEN", "ABC123", 125);

        // A green car was parked for 125 minutes
        ParkedCar car2 = new ParkedCar("BMW", "2001",
                "BLUE", "DIP291", 100);

        // 60 minutes of time was purchased
        ParkingMeter meter = new ParkingMeter(60);

        // Officer Jack was on duty
        PoliceOfficer officer = new PoliceOfficer(
                "Sargent Jack Johnson", "8909");

        ParkingTicket ticket = officer.patrol(car, meter);
        ParkingTicket ticket2 = officer.patrol(car2, meter);

        // Did the officer issue a ticket?
        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No crimes committed!");
        }
    }
}
