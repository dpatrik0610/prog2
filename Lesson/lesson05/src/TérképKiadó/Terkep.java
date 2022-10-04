package TérképKiadó;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Terkep {
    private String cim;
    private int meretarany;
    private List<String> nevjegyzek;

    public Terkep(String cim, int meretarany) {
        if (meretarany > 0){
            this.cim = cim;
            this.meretarany = meretarany;
            nevjegyzek = new ArrayList<>();
        }else{
            throw new IllegalArgumentException();
        }
    }

    public Terkep(){}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terkep terkep = (Terkep) o;
        return meretarany == terkep.meretarany && Objects.equals(cim, terkep.cim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cim, meretarany);
    }

    @Override
    public String toString() {
        return cim + ", 1:" + meretarany + ", " + nevjegyzek;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getMeretarany() {
        return meretarany;
    }

    public void setMeretarany(int meretarany) {
        this.meretarany = meretarany;
    }

    public void addNevjegyzek(String nev){
        nevjegyzek.add(nev);
    }
    public List<String> getNevjegyzek() {
        return nevjegyzek;
    }

    public void shrinkNevjegyzek(int hosszusag){
        List<String> ujNevjegyzek = new ArrayList<>();
        for(String item : nevjegyzek){
            if (item.length() == hosszusag){
                ujNevjegyzek.add(item);
            }
        }

        this.nevjegyzek = ujNevjegyzek;
    }

    public boolean nagybetusit(){
        boolean valtozott = false;
        List<String> upperNevjegyzek = new ArrayList<>();
        for(String item : nevjegyzek){
            if (Character.isUpperCase(item.charAt(0))){
                upperNevjegyzek.add(item);
            }else {
                upperNevjegyzek.add(item.substring(0, 1).toUpperCase() + item.substring(1));
                System.out.println(item.substring(0,1) + " -> " + item.substring(0,1).toUpperCase());
                valtozott = true;
            }
        }
        nevjegyzek = upperNevjegyzek;
        return valtozott;
    }
    /** Konst: meretarany < 0, dobjon: IllegalArgumentException
     * equals: cim es meretarany egyenlo;
     * tostring: cim, 1:meretarany, [nevjegyzek[1]...]
     * nagybetusit: nevjegyzek neveit nagybetusiti,
     * ha valtoztatott valamin, akkor true, kulonben false,
     * TérképKiadó.TematikusTerkep: szarmazik a TérképKiadó.Terkep osztalybol (+ String tema)
     * toString: TérképKiadó.Terkep toString + tema.
     *
     * terkepKiado csomag: public interface TerkepTar{
     *  public void hozzaad(TérképKiadó.Terkep[] terkepek);
     *  visszaadja a terkeptarban talalhato olyan terkepek listajat, amelyek a nevjegyzekeben legalább a
     *  masodik paraméterként megkapott darabszámú név szerepel (adott hosszúságnak megfelelő név)
     *  ha az első paraméter igaz, akkor csak a tematikus terkepeket, ha hamis, akkor mindegyiket.
     *  public java.util.List<TérképKiadó.Terkep> terkepek(boolean csakTematikus, int nevekSzama);
     * }
     * **/

}
