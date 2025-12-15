package h1;

public class H1_main {
    static void main(String[] args) {
        Patient a = new Patient("AJulius", 3);
        Patient b = new Patient("BJulius", 1);
        Patient c = new Patient("CJulius", 5);
        Patient d = new Patient("DJulius", 9);
        Patient e = new Patient("EJulius", 2);

        PrioListe pl = new PrioListe();

        pl.addPatient(a);
        pl.addPatient(b);
        pl.addPatient(c);
        pl.addPatient(d);
        pl.addPatient(e);

        System.out.println(pl.getPosition(d));

        Patient p = pl.getNextPatient();
        while (p != null){
           p.print();
            p = pl.getNextPatient();
        }


    }
}
