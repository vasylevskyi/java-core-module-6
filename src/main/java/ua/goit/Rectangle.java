package ua.goit;

/**
 * Task 14
 */
public class Rectangle {
    int sideA;
    int sideB;

    public Rectangle(int a, int b) {
        sideA = a;
        sideB = b;
    }
    public boolean canPlaceInto(Rectangle anotherRect) {
        if ((sideA <= anotherRect.sideA && sideB <= anotherRect.sideB) || (sideA <= anotherRect.sideB && sideB <= anotherRect.sideA)) {
            return true;
        } else return false;
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}
