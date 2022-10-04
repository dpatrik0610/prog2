package TérképKiadó;

import java.util.ArrayList;
import java.util.List;

public class Atlasz implements TerkepTar{
    public List<Terkep> terkepList;
    public Atlasz(List<Terkep> terkepList) {
        this.terkepList = terkepList;
    }

    @Override
    public void hozzaad(Terkep[] terkepek) {
        for(Terkep item : terkepek){
            terkepList.add(item);
        }
    }

    @Override
    public List<Terkep> terkepek(boolean csakTematikus, int nevekSzama) {
        List<Terkep> t = new ArrayList<>();
        for(Terkep item : terkepList){
            if (csakTematikus && item.getClass() == TematikusTerkep.class)
                t.add(item);
            else{
                t.add(item);
            }
        }
        return t;
        // TODO: nevekszama
    }

    @Override
    public String toString() {
        return terkepList.toString();
    }
}
