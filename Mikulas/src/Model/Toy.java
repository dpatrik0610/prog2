package Model;

public class Toy extends Present{
    private int ageRestriction;

    public Toy(String name, double weight, int price, int ageRestriction) {
        super(name, weight, price);
        this.ageRestriction = ageRestriction;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return super.toString() + " From age: " + ageRestriction;
    }
}
