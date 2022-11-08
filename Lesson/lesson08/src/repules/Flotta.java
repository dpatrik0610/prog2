package repules;

public interface Flotta {
        // új repülőgépet vesz fel a flottába
    public void felvesz(Repulogep repülő);
        // visszaadja azoknak az utasszállítóknak a rendezett listáját (a természetes
        // rendezettség sorrendjében), amelyek legalább a paraméterben megkapott számú
        // férőhellyel rendelkeznek
    public java.util.List<Utasszallito> megfelelőGépek(int utasszám);
        // kiírja a megadott állományba a repülőgépek listáját (mindegyiket külön sorba)
    public void kiír(String fájlnév);
}
