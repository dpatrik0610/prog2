package verseny;

import java.util.Objects;

public abstract class Versenyzo implements Comparable<Versenyzo> {
    protected int id;
    protected String nev;
    protected String tema;

    public Versenyzo(int id, String nev, String tema) {
        this.id = id;
        this.nev = nev;
        this.tema = tema;
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public String toString() {
        return String.format("%s (%s), azonosítója: %x",getNev(),getTema(), getId() );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Versenyzo versenyzo = (Versenyzo) o;
        return id == versenyzo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Versenyzo o) {
        if (this.tema.compareTo(o.tema) == 0){
            if(this.nev.compareTo(o.nev) == 0){
                if (this.id > o.id) return 1;
                if (this.id < o.id) return -1;
                return 0;
            }
            else{
                return this.nev.compareTo(o.nev);
            }
        }else{
            return this.tema.compareTo(o.tema);
        }
    }
}
