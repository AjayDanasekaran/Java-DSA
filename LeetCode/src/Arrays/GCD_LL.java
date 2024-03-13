package Arrays;

import java.util.LinkedList;
import java.util.List;

public class GCD_LL {
    public static void main(String[] args) {
        List<Integer> head = new LinkedList<>() {{
            add(18);
            add(6);
            add(10);
            add(3);
        }};
        insertGreatestCommonDivisors(head);
    }

    public static void insertGreatestCommonDivisors(List<Integer> head) {
        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < head.size() - 1; i++) {
            Integer first = head.get(i);
            Integer second = head.get(i + 1);

            result.add(first);

            int maxDivisor = findGCD(first, second);
            result.add(maxDivisor);
        }

        result.add(head.get(head.size() - 1));  // Add the last element

        for (Integer i : result) {
            System.out.println(i);
        }
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
