/**
 * Created by MR on 1/26/2020.
 */
/**
 * This class should simulate a parking ticket, see exercise for description
 * of responsibilities
 *
 */
class ParkingMeter {

    private int minutesPurchased;

    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }
}
