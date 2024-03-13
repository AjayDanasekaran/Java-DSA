package AlgebraProgramming;
import java.util.Random;
public class Otp {
	String systemOTP,userOTP;
	static String s="";
	static int ranNo;
	
	public static String getOTP(int len)
	{
		for(int i=0;i<len;i++) {
			ranNo=new Random().nextInt(9);
			s= s.concat(Integer.toString(ranNo));
		}
		return s; 
	}
	
	public static void main(String[] args) {
		System.out.println("System Generated OTP is : "+getOTP(4));
	}
	
}
