package ua.goit;

/**
 * Task 11
 */

public class RectangleArea {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    public RectangleArea(int[] coords) {
        for (int i = 0; i < 4; i += 2) {
            if (i == 0) {
                startX = coords[i];
                startY = coords[i + 1];
            }
            if (i == 2) {
                endX = coords[i];
                endY = coords[i + 1];
            }
        }
    }
    public int getArea() {
        return Math.abs((endX - startX) * (endY - startY));
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        //int[] coords = {2, 2, 12, 12};
        int[] coords = {-32, -29, -9, -3};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
