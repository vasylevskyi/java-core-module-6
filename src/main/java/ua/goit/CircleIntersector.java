package ua.goit;

/**
 * Task 12
 */
public class CircleIntersector {
    boolean circleIntersects;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {

        double powSum = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double distance = Math.sqrt(powSum);
        if (distance > r1 + r2) {
            circleIntersects = false;
        } else {
            circleIntersects = true;
        }

    }
    @Override
    public String toString() {
        if (circleIntersects) {
            return "intersects";
        } else {
            return "not intersects";
        }
    }

}

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

