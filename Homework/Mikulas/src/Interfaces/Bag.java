package Interfaces;

import Model.Present;

public interface Bag {
    public void showContent();
    public int sumPrice();
    public void addPresent(Present present);
    public Present getPresent(int i);
}
