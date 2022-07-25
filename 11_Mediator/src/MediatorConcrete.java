import java.util.ArrayList;
import java.util.List;

/**
 * Медиатор конкретный
 */

public class MediatorConcrete implements Mediator {

    List<Taxi> taxiList = new ArrayList<>();

    void add(Taxi taxi) {
        taxiList.add(taxi);
    }


    @Override
    public void requestAl(Trip trip) {

        for (Taxi taxiToDrive : taxiList) {
            if (!taxiToDrive.getBusy() && !trip.isAssignedTrip()) {
                trip.setAssignedTrip(true);
                taxiToDrive.setBooked();
                System.out.println("\n Trip to " + trip.getAddress() + "asigned to " + taxiToDrive.getName());
                break;
            }
        }

        if (!trip.isAssignedTrip()) {
            System.out.println("\n All taxis are busy for " + trip.getAddress() + "Please wait for someone will");
        }


    }
}
