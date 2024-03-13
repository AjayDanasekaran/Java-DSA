package Interview;

import java.util.ArrayList;
import java.util.List;

public class MarsBA {

    public static void main(String[] args) {
        int i1 = 14;
        int i2 = 4;
        int i3[] = {4,6,8,9};
        System.out.print(cal(i1, i2, i3));
    }

    private static int cal(int i1, int i2, int[] i3) {
        int sum = i1;
        int max = Integer.MIN_VALUE;
        List<Integer> excluded = new ArrayList<>();

        for (int value : i3) {
            excluded.add(value);
        }

        for (int i = 1; i <= i1; i++) {
            sum -= i;
            int count = 0;

            if (!excluded.contains(i)) {
                for (int j = i + 1; j <= i1; j++) {
                    if (!excluded.contains(j) && (sum - j) >= 0) {
                        sum -= j;
                        count++;
                    }
                }
                max = Math.max(count, max);
            }
        }

        return max + 1;
    }
}

