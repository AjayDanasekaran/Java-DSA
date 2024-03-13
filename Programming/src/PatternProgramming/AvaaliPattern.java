package PatternProgramming;

public class AvaaliPattern {
	public static void main(String[] args) {
		int col=5;
		int space=2;
		int star=1;
		System.out.println(col/2);
		for(int i=0;i<col;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==(col/2)-1) {
				space=0;
				star=5;
			}
			else {
				space=2;
				star=1;
			}
		}
	}
}
