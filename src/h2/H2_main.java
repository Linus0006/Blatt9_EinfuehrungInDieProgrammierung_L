package h2;

public class H2_main {
    static void main(String[] args) {
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        Passenger passenger1 = new Passenger("Mr. A.", 2, true);
        Passenger passenger2 = new Passenger("Mr. B.", 3, true);
        Passenger passenger3 = new Passenger("Mrs. C.", 5, true);
        Passenger passenger4 = new Passenger("Ms. D.", 9, false);
        Passenger passenger5 = new Passenger("Mr. D.", 4, true);
        Passenger passenger6 = new Passenger("Mr. E.", 3, false);
        Passenger passenger7 = new Passenger("Mrs. F.", 5, false);
        Passenger passenger8 = new Passenger("Mr. G.", 3, true);
        Passenger passenger9 = new Passenger("Mrs. H.", 8, true);
        Passenger passenger10 = new Passenger("Ms. J.", 4, true);

        System.out.println("Check1: ");
        firstBus.listPassengersInBus();

        firstBus.enterBus(passenger1);
        firstBus.enterBus(passenger2);

        System.out.println("Check2: ");
        firstBus.listPassengersInBus();

        firstBus.nextStop();

        System.out.println("Check3: ");
        firstBus.listPassengersInBus();

        firstBus.nextStop(new Passenger[] {passenger4,passenger3,passenger8});

        System.out.println("Check4: ");
        firstBus.listPassengersInBus();

        firstBus.nextStop();

        System.out.println("Check5: ");
        firstBus.listPassengersInBus();

        // Ticket control
        //firstBus.findPassengersWithoutTickets();

        System.out.println("Check6: ");
        firstBus.listPassengersInBus();

        firstBus.nextStop();
        firstBus.transferPassengers(secondBus, new String[] { "Ms. D.", "Ms. D."} );
        System.out.print("Check 2nd Bus: ");
        secondBus.listPassengersInBus();

        System.out.println("Check7: ");
        firstBus.listPassengersInBus();

        firstBus.enterBus(passenger6);
        firstBus.enterBus(passenger7);

        System.out.println("Check8: ");
        firstBus.listPassengersInBus();

        // Ticket control
        firstBus.findPassengersWithoutTickets();

        System.out.println("Check9: ");
        firstBus.listPassengersInBus();

        firstBus.enterBus(passenger9);
        System.out.println("Check9.5: ");
        firstBus.listPassengersInBus();

        firstBus.nextStop();

        System.out.println("Check10: ");
        firstBus.listPassengersInBus();

        firstBus.enterBus(passenger9);
        firstBus.enterBus(passenger10);

        firstBus.nextStop();

        System.out.print("Check11: ");
        firstBus.listPassengersInBus();
    }

}
