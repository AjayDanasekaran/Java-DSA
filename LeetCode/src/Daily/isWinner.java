package Daily;

public class isWinner {
	public static void main(String[] args) {
		int[] player1 = {9,7,10,7};
		int[] player2 = {10,2,4,10};
		int player1Score =0;
        int player2Score =0;
        int n=player1.length;
        for(int i=0;i<n;i++){
            if(player1[i]>=10){
                player1Score+=player1[i];
                System.out.println(player1Score);
                int j=i+1;
                int count=0;
                while(j<n){
                	if(count<2) {
                    player1Score+=player1[j]*2;
                    System.out.println(player1Score);
                    j++;
                    count++;
                    }
                	else {
                		player1Score+=player1[j];break;
                	}
                }
                break;
            }else{
            player1Score+=player1[i];
            System.out.println("else part "+player1Score);}
        }
        for(int i=0;i<n;i++){
            if(player2[i]>=10){
                player2Score+=player2[i];
                int j=i+1;
                int count=0;
                while(j<n){
                	if(count<2) {
                        player2Score+=player2[j]*2;
                        System.out.println(player2Score);
                        j++;
                        count++;
                        }
                    	else {
                    		player2Score+=player2[j];break;
                    	}
                }
                break;
            }else{
            player2Score+=player2[i];}
        }
//        if(player1Score>player2Score){
//            return 1;
//        }
//        else if(player1Score==player2Score){
//            return 0;
//        }
//        else{
//            return 2;
//        }
        System.out.println("Player 1 Score : "+player1Score+"\nPlayer 2 Score : "+player2Score);
	}
}
