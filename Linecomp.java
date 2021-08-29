import java.util.Objects;

public class Linecomp {
    static double distance(int x1, int y1, int x2, int y2)
    {
        // Calculating distance
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        double dis = distance(5,4,8,6);
        System.out.println("distance  "+dis);
        double dis1=distance(3,6,8,7);
        System.out.println("distance "+dis1);
        System.out.println(Objects.equals(dis, dis1));
    }
}
