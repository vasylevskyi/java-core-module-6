package ua.goit;

import java.util.Arrays;

/**
 * Task 8
 */

public class PowTable {
    public static final int[] POWERS_2 = new int[10];

    static {
        for (int j = 1; j <= 10; j++) {
            POWERS_2[j - 1] = j * j;
        }
   }
}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
