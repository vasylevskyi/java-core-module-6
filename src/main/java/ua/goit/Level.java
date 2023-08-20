package ua.goit;

/**
 * Task 16
 */

public class Level {
    String levelName;
    public Level(String levelName) {
        this.levelName = levelName;
    }
    @Override
    public String toString() {
        return "Quarke level, name is " + levelName;
    }
}

class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}
