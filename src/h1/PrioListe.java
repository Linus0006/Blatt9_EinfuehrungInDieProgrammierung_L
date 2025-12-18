package h1;

import java.util.ArrayList;

public class PrioListe {

    public ArrayList<Patient> myList = new ArrayList<>();

    public void addPatient (Patient p){
        if (myList.isEmpty() == true){
            myList.add(p);
            return;
        }
        int i = 0;
        while (myList.size() > i){
            Patient pComp = myList.get(i);
            if (pComp.getPrio() >= p.getPrio()){
                myList.add(i,p);
                return;
            }
            i++;

        }
        myList.add(p);
    }

    public Patient getNextPatient(){
        if (myList.isEmpty()){
            return null;

        }
        Patient p = myList.get(0);
        myList.remove(0);
        return p;

    }
    public int getPosition (Patient p){
        return myList.indexOf(p);

    }
}
