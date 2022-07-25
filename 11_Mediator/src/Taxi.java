/**
 * Коллега - такси
 */

public interface Taxi {

    String getName();

    void setBooked();
    void setFree();
    void setRest();

    boolean getBusy();

    System getStatus();

    void assingDriver(Trip trip);



}
