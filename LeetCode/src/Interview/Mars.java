package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mars {

    public static void main(String[] args) {
        mars();
    }

    public static void mars() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> dup = new ArrayList<>();
        List<List<Integer>> sack = new ArrayList<>();
        List<List<Integer>> sack2 = new ArrayList<>();

        System.out.print("All stones on Mars: ");
        for (int stone : a) {
            System.out.print(stone + " ");
        }
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Duplicate stone no. " + (i + 1) + ": ");
            int ele = scanner.nextInt();
            dup.add(ele);
        }

        List<Integer> b = new ArrayList<>();
        for (int i : a) {
            if (!dup.contains(i)) {
                b.add(i);
            }
        }

        System.out.println();
        System.out.print("Duplicate stones on Earth: ");
        for (int stone : dup) {
            System.out.print(stone + " ");
        }
        System.out.println("\n");
        System.out.print("Remaining stones: ");
        for (int stone : b) {
            System.out.print(stone + " ");
        }

        int m = getMax(b);

        for (int i : b) {
            for (int j : b.subList(1, b.size())) {
                for (int k : b.subList(2, b.size())) {
                    for (int x : b.subList(3, b.size())) {
                        if (i + j + k + x == m) {
                            sack.add(List.of(i, j, k, x));
                        } else if (i + j + k == m) {
                            sack.add(List.of(i, j, k));
                        } else if (i + j == m) {
                            sack.add(List.of(i, j));
                        }
                    }
                }
            }
        }

        System.out.println();
        List<Integer> maxCap = getMaxList(sack);
        for (List<Integer> p : sack) {
            if (maxCap.size() == p.size()) {
                sack2.add(p);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> i : sack2) {
            if (!res.contains(i)) {
                res.add(i);
            }
        }

        System.out.println("Maximum possible combinations of stones: " + res);
    }

    private static int getMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static List<Integer> getMaxList(List<List<Integer>> list) {
        List<Integer> maxList = new ArrayList<>();
        int maxLength = 0;
        for (List<Integer> l : list) {
            if (l.size() > maxLength) {
                maxList = l;
                maxLength = l.size();
            }
        }
        return maxList;
    }
}
