package h2;

public class Passenger {

    private String name;
    private int planned;
    private int visited;
    private boolean ticket;

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
