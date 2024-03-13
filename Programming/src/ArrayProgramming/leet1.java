package ArrayProgramming;

public class leet1 {
	public static void main(String[] args) {
		int[] prices = {98, 54, 6, 34, 66, 63, 52, 39};
	    int money = 62;
	    int result = buyChoco(prices, money);
	    System.out.println(result);
	}
	    public static int buyChoco(int[] prices, int money) {
	        int Moneyleftover=money;
	        for(int i=0;i<prices.length;i++){
	            for(int j=i+1;j<prices.length;j++){
	                int sum=prices[i]+prices[j];
	                int leftover=money-sum;
	                if(leftover>=0 && leftover<Moneyleftover){
	                    Moneyleftover=leftover;
	                }
	            }
	        }
	        return Moneyleftover;
	    }
}
