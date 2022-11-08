package legikozlekedes;

import repules.Flotta;
import repules.Repulogep;
import repules.Utasszallito;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Legitarsasag implements Flotta {
    public String name;
    public List<Repulogep> repulogepList;

    public Legitarsasag(String name, List<Repulogep> repulogepList) {
        this.name = name;
        this.repulogepList = repulogepList;
    }

    @Override
    public void felvesz(Repulogep repulo) {
        this.repulogepList.add(repulo);
    }

    @Override
    public List<Utasszallito> megfelelőGépek(int utasszam) {
        List<Utasszallito> utasszallitoList = new ArrayList<>();
        for (Repulogep repulo : repulogepList){
            if (repulo.getClass() == Utasszallito.class && ((Utasszallito) repulo).getFerohely() >= utasszam){
                utasszallitoList.add((Utasszallito) repulo);
            }
        }
        Collections.sort(utasszallitoList);
        return utasszallitoList;
    }

    @Override
    public void kiír(String filenev) {
        try{
            FileWriter fileWriter = new FileWriter(new File(filenev));
            fileWriter.write(name + "\n");
            for(var repulo: repulogepList){
                fileWriter.write(repulo.toString() + "\n");
            }
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Nincs ilyen filenev");
        }
    }

    public void kiirCsakRepulo(){
        List<String> gyartok = new ArrayList<>();
        // Belerakjuk az utasszalitok gyartojat egy listaba
        for (Repulogep r : repulogepList){
            if (r.getClass() == Utasszallito.class){
                gyartok.add(r.getGyarto());
            }
        }
        // kiirjuk azokat a repülőgépgyártókat, amik repülők, de nem utasszálítók.
        for(Repulogep r : repulogepList){
            if (!gyartok.contains(r.getGyarto())){
                System.out.println(r);
            }
        }
    }
}
