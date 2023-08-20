package ua.goit;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Task 15
 */

public class TargetFinder {
    int[] target;

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int minDistance = 0;
        int calcDistance;
        for (int i = 0; i < targets.length; i++) {
            double powSum = Math.pow((targets[i][0] - aiCoords[0]), 2) + Math.pow((targets[i][1] - aiCoords[1]), 2);
            calcDistance = (int) Math.round(Math.sqrt(powSum));
            if (i == 0) {
                minDistance = calcDistance;
                target = Arrays.copyOf(targets[i], targets[i].length);
            } else if (calcDistance <= minDistance) {
                minDistance = calcDistance;
                target = Arrays.copyOf(targets[i], targets[i].length);
            }
        }
        return target;
        }
    @Override
    public String toString() {
        return Arrays.toString(target);
    }

}

class TargetFinderTest {
    public static void main(String[] args) {
/*        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };*/
//      Should be [0, -1]
        int[] aiCoords = {-6, -1};
        int[][] targets = {{12, -1}, {21, -1}, {26, -1}, {43, -1}, {0, -1}};

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
