import java.util.Comparator;
import java.util.Objects;
import java.lang.Integer;

public class Linecomp {
	Integer disCast = null;
	Integer disCast1 = null;
    double distance(int x1, int y1, int x2, int y2)
    {
        // Calculating distance
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public void compare() {
    	int comp = disCast.compareTo(disCast1);
        if(comp > 0) {
            System.out.println("line:1 is greater than line:2");
        } else if(comp< 0) {
            System.out.println("line:1 is less than line:2");
        } else {
            System.out.println("line:1 is equal to line:2");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        Linecomp linecomp = new Linecomp();
        int dis =(int) linecomp.distance(5,4,8,6);
        linecomp.disCast = Integer.valueOf(dis);
        System.out.println("distance ::"+dis);
        int dis1= (int) linecomp.distance(3,6,8,7);
        linecomp.disCast1 = Integer.valueOf(dis1);
        System.out.println("distance ::"+dis1);
        //System.out.println(Objects.equals(dis, dis1))
        linecomp.compare();
        
    }
}
