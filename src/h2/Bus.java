package h2;

import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passengers;

    public Bus () {
        this.passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p) {
        passengers.add(p);
    }

    private void exitBus() {
        int i = 0;
        if (passengers.isEmpty() == false) {

            while (i < passengers.size()) {
                Passenger p = passengers.get(i);
                if (p.getPlanned() == p.getVisited()) {
                    passengers.remove(i);
                } else {
                    i++;
                }
            }
        }
    }

    public void nextStop(Passenger[] boarding) {
        int i = 0;
        if (passengers.isEmpty() == false) {
            while (i < passengers.size()) {
                Passenger p = passengers.get(i);
                p.nextStopVisited();
                i++;
            }
        }
        exitBus();

        i = 0;
        while (i < boarding.length){
            enterBus(boarding[i]);
            i++;
        }
    }

    public void nextStop() {
        nextStop(new Passenger[] {});
    }

    public ArrayList findPassengersWithoutTickets () {
        ArrayList <Passenger> passengersWithoutTickets = new ArrayList<>();

        int i = 0;
        while (i < passengers.size()) {
            Passenger p = passengers.get(i);

            if (!p.getTicket()) {
                passengersWithoutTickets.add(p);
                passengers.remove(i);
            } else {
                i++;
            }
        }
        return passengersWithoutTickets;
    }

    public void transferPassengers (Bus otherBus, String [] passengerNames) {
        int j = 0;
        boolean found;
        while (j < passengers.size()) {
            Passenger p = passengers.get(j);
            int i = 0;
            found = false;
            while (i < passengerNames.length) {
                if (p.getName() == passengerNames[i]) {
                    passengers.remove(j);
                    otherBus.enterBus(p);
                    found = true;
                    break;
                }
                i++;
            }
            if (found == false) {
                j++;
            }
        }
    }

    public void listPassengersInBus () {
        if (passengers.isEmpty() == false) {
            int i = 0;
            while (i < passengers.size()) {
                Passenger p = passengers.get(i);
                System.out.print("Name:" + p.getName() + " Ticket: " + p.getTicket());
                System.out.println(" Visited: " + p.getVisited() + " Planned: " + p.getPlanned() + ".");

                i++;
            }
        } else
            System.out.println("empty bus.");
    }

}
