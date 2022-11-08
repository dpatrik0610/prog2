package repules;

import java.util.Objects;

public class Repulogep implements Comparable<Repulogep>{
    protected String gyarto;
    protected String tipus;
    protected double hossz;
    protected boolean sugarhajtasu;

    public Repulogep(String gyarto, String tipus, double hossz, boolean sugarhajtasu){
        if(hossz < 0){
            throw new IllegalArgumentException();
        }else{
            this.gyarto = gyarto;
            this.tipus = tipus;
            this.hossz = hossz;
            this.sugarhajtasu = sugarhajtasu;
        }
    }

    public String getGyarto() {
        return gyarto;
    }

    public boolean isSugarhajtasu() {
        return sugarhajtasu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repulogep repulogep = (Repulogep) o;
        return gyarto.equalsIgnoreCase(repulogep.gyarto) && tipus.equalsIgnoreCase(repulogep.tipus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gyarto, tipus);
    }
    @Override
    public String toString(){
        if (sugarhajtasu){
            return gyarto + " " + tipus + " sugárhajtású repülőgép, hossza: " + hossz;
        }else {
            return gyarto + " " + tipus + " repülőgép, hossza: " + hossz;
        }
    }


    @Override
    public int compareTo(Repulogep o) {
        if (gyarto.compareToIgnoreCase(o.gyarto) != 0){
            gyarto.compareToIgnoreCase(o.gyarto);
        }else{
            return tipus.compareToIgnoreCase(o.tipus);
        }
        return 0;
    }
}
