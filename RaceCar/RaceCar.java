import java.awt.Color;
public class RaceCar {
    private final static double TOP_SPEED = 300.0;
    private String name;
    private Color color;

    public RaceCar(String name, double color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public static Racecar race(Racecar r1, Racecar r2) {
        double race1speed = Math.random() * TOP_SPEED;
        double race2speed = Math.random() * TOP_SPEED;

        if (race1speed > race2speed) {
            return r1;
        } 
		else if (race1speed < race2speed) {
            return r2;
        } else {
            return null;
        }
    }

    public static void main(String args[]) {
        Racecar a = new Racecar("ABCD", Color.BLUE);
        Racecar b = new Racecar("XYZ",  Color.RED);
        Racecar winner = race(a, b);

        if (winner == null) {
            System.out.println("No winner");
        } else {
            System.out.println(winner.getName() + " won!");
        }
    }
}
