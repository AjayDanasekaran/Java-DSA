package Interview;

import java.util.ArrayList;

public class Voya_MarsStone {
	public static void main(String[] args) {
		int []testCase1 = {1,3,5};
		int []testCase2 = {4,6,8,9};
//		maxUniqueStones(10,3,testCase1);
		maxUniqueStones(14,4,testCase2);
	}
	public static void maxUniqueStones(int input1, int input2, int[] input3) {
		ArrayList<Integer> uniqueStones = new ArrayList<>();
		for(int i=1;i<input1;i++) {
			uniqueStones.add(i);
		}
		for(int v:input3) {
			uniqueStones.removeIf(e->e==v);
		}
		uniqueStones.forEach(e->{System.out.println(e);});
		int count=0;
		for(int i=0;i<uniqueStones.size();i++) {
			for(int j=i+1;j<uniqueStones.size();j++) {
				if(uniqueStones.get(i)+uniqueStones.get(j)==input1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
