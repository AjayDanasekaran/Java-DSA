package Daily;

import java.util.Arrays;

public class BankArrayConversion {

	public static void main(String[] args) {
		String[] bank = {"011001", "000000", "010100", "001000"};
		for(int i=0;i<bank.length;i++){
            char []arr =bank[i].toCharArray();
            System.out.println(Arrays.toString(arr));
        }
	}

}
