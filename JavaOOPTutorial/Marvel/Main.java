package Marvel;
public class Main {
    public static void main(String[] args) {
        Ironman h1 = new Ironman();
        h1.setName("Tony Stark");
        h1.power("Rich + Iron mask");
        h1.setAge("40");
        h1.setJob("Engineer");
        h1.display();
        h1.jumping("5 m");
        h1.weapon("Energy beam");
        h1.moving("400 km/s");
        System.out.println("");

        Thor h2 = new Thor();
        h2.setName("Thor Odinson");
        h2.power("Thunder");
        h2.setAge("5000");
        h2.setJob("King of Asgard");
        h2.display();
        h2.jumping("100 m");
        h2.weapon("Mjonir");
        h2.moving("1000 km/s");
        System.out.println("");
    }
}
