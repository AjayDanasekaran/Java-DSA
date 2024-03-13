package GFGThread;
class Jspiders{
	public void welcome(String name) {
		System.out.println("Welcome to Jspiders "+name);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		System.out.println("Class over, get out "+name);
	}
}
class ThreadJspy extends Thread{
	Jspiders jspy;
	String name;
	ThreadJspy(Jspiders jspy,String name){
		this.jspy=jspy;
		this.name = name;
	}
	public void run() {
		synchronized(jspy) {
			jspy.welcome(name);
		}
	}
	
}
public class SyncDemo1 {
	public static void main(String[] args) {
		Jspiders j =new Jspiders();
		ThreadJspy t1= new ThreadJspy(j,"Ajay");
		ThreadJspy t2= new ThreadJspy(j,"Rohan");
		ThreadJspy t3= new ThreadJspy(j,"Sahana");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e) {
			System.out.println("error occured");
		}
		System.out.println("ACHAAAA");
	}
}
