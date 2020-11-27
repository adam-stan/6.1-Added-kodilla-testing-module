package various.odwaznyrycerz;

public class Application {

    public static void main(String[] args) {
        Knight knight = new Knight();
        
        String obiekt = knight.rozpoznaj(new DeadIslandQuest());
        System.out.println(obiekt);

        obiekt = knight.rozpoznaj(new EliteKnightQuest());
        System.out.println(obiekt);

    }
}
