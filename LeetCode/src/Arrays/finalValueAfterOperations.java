package Arrays;

public class finalValueAfterOperations {
	public static void main(String[] args) {
		String []operations = {"--X","X++","X++"};
		int x=0;
        for(String s: operations){
            switch(s){
                case "--X":{x+=-1;
                break;}
                case "X++":{x+=1;
                break;}
                case "++X":{x+=1;
                break;}
                case "X--":{x+=-1;
                break;}
            }
        }
        System.out.println(x);
	}
}
