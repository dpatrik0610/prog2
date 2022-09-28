package Model;

public class Present{

    private String name;
    private double weight;
    private int price;

    public Present(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Present() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    /** Detailed information of a Present */
    @Override
    public String toString() {
        return String.format("%-10s| %-4s kg | %6sFt.",name,weight,price);
    }
    /** Shows if a present equals to another object */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Present present = (Present) o;

        if (Double.compare(present.weight, weight) != 0) return false;
        return name.equals(present.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
