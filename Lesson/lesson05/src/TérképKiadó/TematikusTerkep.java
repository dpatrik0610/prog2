package TérképKiadó;

import TérképKiadó.Terkep;

public class TematikusTerkep extends Terkep {
    private String tema;

    public TematikusTerkep(String cim, int meretarany, String tema) {
        super(cim, meretarany);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return super.toString() + ", Téma: " + tema;
    }
}
