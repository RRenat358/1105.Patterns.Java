/**
 * Поездка
 *
 */

public class Trip {

    private boolean assignedTrip;
    private String address;

    public Trip(boolean assignedTrip, String address) {
        this.assignedTrip = assignedTrip;
        this.address = address;
    }

    public boolean isAssignedTrip() {
        return assignedTrip;
    }

    public void setAssignedTrip(boolean assignedTrip) {
        this.assignedTrip = assignedTrip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
