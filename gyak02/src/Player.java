import java.util.Objects;

public class Player {

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getArmour() {
        return armour;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveY(int n) {
        this.y+= n;
    }
    private String name;
    private int health;
    private int armour;
    private int x;
    private int y;

    public Player() {}

    public Player(String _name, int _hp, int _ap) {
        name = _name;
        health = _hp;
        armour = _ap;
        x = 0;
        y = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return health == player.health && armour == player.armour && x == player.x && y == player.y && name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, armour, x, y);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", armour=" + armour +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
