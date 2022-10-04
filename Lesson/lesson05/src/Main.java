import TérképKiadó.Atlasz;
import TérképKiadó.TematikusTerkep;
import TérképKiadó.Terkep;

public class Main {
    public static void main(String[] args) {
        Atlasz nagyAtlasz = new Atlasz();

        Terkep[] newMaps = setVector(3);
        nagyAtlasz.hozzaad(newMaps);
        Atlasz kisAtlasz = new Atlasz();
        kisAtlasz.terkepList = nagyAtlasz.terkepek(false, 8);
        System.out.println(kisAtlasz);
    }

    private static Terkep[] setVector(int length) {
        Terkep[] newMaps = new Terkep[length];
        newMaps[0] = new Terkep("Magyarország", 24000);
        newMaps[1] = new TematikusTerkep("Magyarország", 10000, "Ipar");
        newMaps[2] = new Terkep("Németország", 24000);

        newMaps[0].addNevjegyzek("Debrecen");
        newMaps[0].addNevjegyzek("Miskolc");
        newMaps[0].addNevjegyzek("Budapest");

        newMaps[1].addNevjegyzek("Sátoraljaújhely");
        newMaps[1].addNevjegyzek("Tiszaújváros");

        newMaps[2].addNevjegyzek("Hamburg1");

        return newMaps;
    }
}
