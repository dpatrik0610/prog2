package TérképKiadó;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atlasz implements TerkepTar{
    public List<Terkep> terkepList;
    public Atlasz() {
        this.terkepList = new ArrayList<>();
    }

    @Override
    public void hozzaad(Terkep[] terkepek) {
        for(Terkep item : terkepek){
            terkepList.add(item);
        }
    }

    @Override
    public List<Terkep> terkepek(boolean csakTematikus, int hosszusag) {
        List<Terkep> t = new ArrayList<>();
        for(Terkep item : terkepList){
            if (csakTematikus && item.getClass().equals(TematikusTerkep.class)) {
                item.shrinkNevjegyzek(hosszusag);
                t.add(item);
            }

            if(!csakTematikus){
                item.shrinkNevjegyzek(hosszusag);
                t.add(item);
            }
        }

        return t;
    }

    @Override
    public String toString() {
        String line = "";
        for(Terkep t : terkepList){
            line += t.toString() + "\n";
        }
        return line;
    }
}
