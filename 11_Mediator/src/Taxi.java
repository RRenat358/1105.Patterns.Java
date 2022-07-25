/**
 * Коллега - такси
 */

public interface Taxi {

    String getName();

    void setBooked();
    void setFree();
    void setRest();

    boolean getBusy();

    String getStatus();

    void assingDriver(Trip trip);



}
