package dalverseny;

import verseny.Egyeni;
import verseny.Verseny;
import verseny.Versenyzo;

import java.util.ArrayList;
import java.util.Collections;

public class XFaktor implements Verseny {
    protected String evad;
    protected ArrayList<Versenyzo> versenyzok;

    public XFaktor(String evad, Versenyzo[] versenyzok) {
        this.evad = evad;
        for(Versenyzo versenyzo : versenyzok)
            this.versenyzok.add(versenyzo);
    }

    @Override
    public void nevez(Versenyzo versenyzo) {
        if (!this.versenyzok.contains(versenyzo)){
            this.versenyzok.add(versenyzo);
        }
    }

    @Override
    public boolean visszalép(int azonosíto) {
        return false;
    }

    @Override
    public int[] versenyzőkSzáma() {
        int egyeniCount = versenyzok.forEach(x -> x.getClass() == Egyeni.class);
        return new int[] {egyeniCount, csapatCount};
    }

    public String getEvad() {
        return evad;
    }

    public ArrayList<Versenyzo> getVersenyzok() {
        return versenyzok;
    }

    @Override
    public String toString() {
        String fejlec = "X-Faktor - " + getEvad();
        Collections.sort(getVersenyzok());
        return fejlec + "\n" + getVersenyzok();
    }
}
