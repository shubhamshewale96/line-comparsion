import java.util.Comparator;
import java.util.Objects;
import java.lang.Integer;

public class Linecomp {
    static double distance(int x1, int y1, int x2, int y2)
    {
        // Calculating distance
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        Integer dis = (int)distance(5,4,8,6);
        System.out.println("distance  "+dis);
        Integer dis1=(int)distance(3,6,8,7);
        System.out.println("distance "+dis1);
        //System.out.println(Objects.equals(dis, dis1))
        int comp = dis.compareTo(dis1);
        if(comp > 0) {
            System.out.println("line1 is greater than line2");
        } else if(comp< 0) {
            System.out.println("line1 is less than line2");
        } else {
            System.out.println("line1 is equal to line2");
        }
    }
}
