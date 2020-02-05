/**
 * Created by MR on 1/26/2020.
 */
/**
 * This class should simulate a police officer inspecting parked cars.
 *
 */
class PoliceOfficer {

    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {

        ParkingTicket ticket = null;

        // Calculate the total number of minutes parked over minutes
        // purchased
        int illegalMinutes = car.getMinutesParked()
                - meter.getMinutesPurchased();

        // if illegalMinutes, give ticket
        if (illegalMinutes > 0) {
            // Yes, it is illegally parked.
            ticket = new ParkingTicket(car, this, illegalMinutes);
        }

        return ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
}
