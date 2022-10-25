package verseny;

import java.util.ArrayList;

public class Csapat extends Versenyzo{
    protected ArrayList<String> csapattagok;
    public Csapat(int id, String nev, String tema, ArrayList<String> csapattagok) {
        super(id, nev, tema);
        this.csapattagok = csapattagok;
    }

    public ArrayList<String> getCsapattagok() {
        return csapattagok;
    }

    @Override
    public String toString() {
        return "csapat: " + super.toString() + "tagjai: " + getCsapattagok();
    }
}
