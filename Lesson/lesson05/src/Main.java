import TérképKiadó.TematikusTerkep;
import TérképKiadó.Terkep;

public class Main {
    public static void main(String[] args) {
        Terkep t = new Terkep("Magyarország", 24);
        t.addNevjegyzek("Debrecen");
        t.addNevjegyzek("miskolc");
        t.addNevjegyzek("Budapest");
        t.addNevjegyzek("Győr");
        System.out.println(t);
        System.out.println("Nagybetűsítésre szükség volt: "+ (t.nagybetusit() ? "Igen": "Nem"));

        TematikusTerkep tt = new TematikusTerkep("Magyarország",24, "Ipar" );
        tt.addNevjegyzek("Sátoraljaújhely");
        System.out.println(tt.getClass());
    }
}
