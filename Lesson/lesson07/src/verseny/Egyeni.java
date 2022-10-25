package verseny;

public class Egyeni extends Versenyzo{
    protected int eletkor;

    public Egyeni(int id, String nev, String tema, int eletkor) {
        super(id, nev, tema);
        this.eletkor = eletkor;
    }

    public int getEletkor() {
        return eletkor;
    }

    @Override
    public String toString() {
        return "egyéni versenyző: " + super.toString() + " kora: " + getEletkor();
    }
}
