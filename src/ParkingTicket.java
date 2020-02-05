/**
 * Created by MR on 1/26/2020.
 */
/**
 * This class should simulate a parking ticket.
 *
 */
class ParkingTicket {

    private ParkedCar car; // composition -- has a relationship
    private PoliceOfficer officer; // composition -- has a relationship
    private double fine;
    private int minutes;

    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutes) {
        this.car = car;
        this.officer = officer;
        this.minutes = minutes;

        calculateFine();
    }

    private void calculateFine() {

        double hours = minutes / 60.0;
        int hoursAsInt = (int) hours;

        if ((hours - hoursAsInt) > 0) {
            hoursAsInt++;
        }

        // Assign the base fine.
        fine = BASE_FINE;

        // Add the additional hourly fines.
        fine += (hoursAsInt * HOURLY_FINE);
    }

    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "ParkingTicket [car=" + car + ", officer=" + officer
                + ", fine=" + fine + ", minutes=" + minutes
                + ", BASE_FINE=" + BASE_FINE + ", HOURLY_FINE="
                + HOURLY_FINE + "]";
    }

}
