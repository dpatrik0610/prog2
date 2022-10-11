import TérképKiadó.Atlasz;
import TérképKiadó.TematikusTerkep;
import TérképKiadó.Terkep;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fileHandler.myReader;

public class Main {
    public static void main(String[] args) {
        Atlasz nagyAtlasz = new Atlasz();
        nagyAtlasz.terkepList = makeTerkep("src/source.txt");
        System.out.println(nagyAtlasz);
    }

    private static List<Terkep> makeTerkep(String fileName) {
        List<Terkep> terkepek = new ArrayList<>();

        myReader r = new myReader(fileName);
        for(String line : r.getDataList()){
            String[] newline = line.split(";");
            if(newline.length == 2){
                Terkep myTerkep = new Terkep(newline[0], Integer.parseInt((newline)[1].split(":")[1]));
                terkepek.add(myTerkep);
            }
            if (newline.length == 3) {
                Terkep myTerkep = new Terkep(newline[0], Integer.parseInt((newline)[1].split(":")[1]));
                for (String nev : newline[2].split(":")) {
                    myTerkep.addNevjegyzek((nev));
                }
                terkepek.add(myTerkep);
            }

            if (newline.length == 4){
                Terkep myTerkep = new TematikusTerkep(newline[0], Integer.parseInt((newline)[1].split(":")[1]), newline[3]);
                for (String nev : newline[2].split(":")) {
                    myTerkep.addNevjegyzek(nev);
                }
                terkepek.add(myTerkep);
            }

        }
        return terkepek;
    }
}
