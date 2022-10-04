package TérképKiadó;

public interface TerkepTar {
    void hozzaad(TérképKiadó.Terkep[] terkepek);
    java.util.List<TérképKiadó.Terkep> terkepek(boolean csakTematikus, int nevekSzama);
}
