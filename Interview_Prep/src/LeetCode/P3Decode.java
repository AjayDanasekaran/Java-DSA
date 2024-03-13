package LeetCode;

import java.util.Arrays;

public class P3Decode {

	public static void main(String[] args) {
		String testCase1="12";
		String testCase2="226";
		int ind=0;
        char deco[] = new char[testCase1.length()+1];
        for(char c:testCase1.toCharArray()){deco[ind++]=c;}
        deco [testCase1.length()] = (char) (testCase1.charAt(0) * 10 + testCase1.charAt(1));
        System.out.println(Arrays.toString(deco));
        int count=0;
        for(int i=0;i<deco.length;i++){
            int a = deco[i]+64;
            if(a>64 && a<91){
                count++;
            }
        }
        System.out.println(count);
	}

}
