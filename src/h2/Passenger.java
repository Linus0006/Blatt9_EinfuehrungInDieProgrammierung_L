package h2;

public class Passenger {

    public String name;
    public int planned;
    public int visited;
    public boolean ticket;

    public Passenger(String name, int planned, boolean ticket){
        this.name = name;
        this.planned = planned;
        this.ticket = ticket;
        this.visited = 0;

    }

    public int getVisited(){
        return this.visited;

    }
    public int getPlanned(){
        return this.planned;
    }

    public boolean getTicket(){
        return this.ticket;
    }

    public String getName(){
        return this.name;
    }

    public void nextStopVisited(){
        visited++;
    }
}
