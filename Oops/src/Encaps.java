//Encapsulation can be used to hide both data members and data functions or methods associated with an instantiated class or object.
//Encapsulation is a way to restrict the direct access to some components of an object, 
//so users cannot access state values for all of the variables of a particular object.
public class Encaps {
	public static void main(String[] args) {
	Bank b= new Bank();
//	b.name;
//	b.otp;
	System.out.println( b.getName());
	System.out.println( b.getOtp());
	b.setName("sana");
	b.setOtp(777);
	System.out.println( b.getName());
	System.out.println( b.getOtp());
	}
}
class Bank{
	private String name = "SAHANA";
	private int otp = 3456;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}	
}