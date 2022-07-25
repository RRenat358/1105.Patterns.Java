

public class MediatorApp {
    public static void main(String[] args) {
        System.out.println("\n==============================");
        System.out.println("=== Mediator =================\n");

        MediatorConcrete mediatorConcrete = new MediatorConcrete();


        TaxiConcrete taxiConcrete1 = new TaxiConcrete("Driver 1", "Free", false, mediatorConcrete);
        TaxiConcrete taxiConcrete2 = new TaxiConcrete("Driver 2", "Free", false, mediatorConcrete);
        TaxiConcrete taxiConcrete3 = new TaxiConcrete("Driver 3", "Free", false, mediatorConcrete);
        TaxiConcrete taxiConcrete4 = new TaxiConcrete("Driver 4", "Free", false, mediatorConcrete);
        TaxiConcrete taxiConcrete5 = new TaxiConcrete("Driver 5", "Free", false, mediatorConcrete);


        mediatorConcrete.add(taxiConcrete1);
        mediatorConcrete.add(taxiConcrete2);
        mediatorConcrete.add(taxiConcrete3);
        mediatorConcrete.add(taxiConcrete4);
        mediatorConcrete.add(taxiConcrete5);


        Trip trip = new Trip(false, "Address 1");
        taxiConcrete1.assingDriver(trip);
        System.out.println("\n next trip");
        System.out.println("------------------------------");


        Trip trip2 = new Trip(false, "Address 1");
        taxiConcrete1.assingDriver(trip2);
        System.out.println("\n next trip");
        System.out.println("------------------------------");

        Trip trip3 = new Trip(false, "Address 1");
        taxiConcrete1.assingDriver(trip3);
        System.out.println("\n next trip");
        System.out.println("------------------------------");

        Trip trip4 = new Trip(false, "Address 1");
        taxiConcrete1.assingDriver(trip4);
        System.out.println("\n next trip");
        System.out.println("------------------------------");

        Trip trip5 = new Trip(false, "Address 1");
        taxiConcrete1.assingDriver(trip5);
        System.out.println("\n next trip");
        System.out.println("------------------------------");

        Trip trip6 = new Trip(false, "Address 1");
        taxiConcrete1.assingDriver(trip6);
        System.out.println("\n next trip");
        System.out.println("------------------------------");

        taxiConcrete3.setFree();
        taxiConcrete5.assingDriver(trip6);


        Trip trip7 = new Trip(false, "Address 1");
        taxiConcrete1.assingDriver(trip7);
        System.out.println("\n next trip");
        System.out.println("------------------------------");



        System.out.println("\n=== END ======================");
        System.out.println("==============================\n");

    }

}
