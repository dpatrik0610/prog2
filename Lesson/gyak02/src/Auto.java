public class Auto {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto() {}
    public Auto(String rendszam, int teljesitmeny, boolean automata){
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }
    /**
     * Konstruktor 0param / 3 param
     * getter, setter
     * toString()
     * equals, csak a teljesitmenyt figyelje
     * peldanyok, 1. peldany 0param, 2. peldany 3 param
     **/

    public String getRendszam() {
        return this.rendszam;
    }
    public int getTeljesitmeny() {
        return this.teljesitmeny;
    }
    public boolean getAutomata() {
        return this.automata;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }
    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }
    public void setAutomata(boolean automata) {
        this.automata = automata;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rendszam = '" + rendszam + "\'" + ' '+
                "teljesitmeny = " + teljesitmeny + ' '+
                "automata = " + automata;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return teljesitmeny == auto.teljesitmeny;
    }
}
