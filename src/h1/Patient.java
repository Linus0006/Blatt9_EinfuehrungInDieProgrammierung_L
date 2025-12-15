package h1;

public class Patient {

    private String name;
    private int prio;

    public Patient (String name, int prio){
        this.name = name;
        this.prio = prio;
    }

    public void print (){
        System.out.println("object:" + this + " name:" + this.name + " prio:" + this.getPrio());


    }
    public int getPrio(){
        return this.prio;
    }
}
