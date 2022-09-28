public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Zoli", 100, 20);
        Player player2 = new Player("Ákos", 100, 50);

        System.out.println(player1);
        System.out.println(player2);

        /**if(player1.equals(player2)){
            System.out.println("Egyenlő");
        }
        else {
            System.out.println("nem egyenlő");
        }**/

        player1.moveY(5);
        System.out.println(player1);

        System.out.println("-----------------------------");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("ASD-123", 120, true);
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto1.equals(auto2));

        auto2.setTeljesitmeny(0);
        System.out.println(auto1.equals(auto2));
    }
}
