package Multithreading;
public class LambdaThread {
	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println("Child Thread");
		};
		Thread t1 = new Thread(r);
		t1.start();
		System.out.println("Main Thread b            ihbjhbbvnbvhgvb nbvjgkvhgvjhbnkjbydyugipuhguyvhgiuuhubjh ytvjh h hbh hvhjh jb hg hv hg yfbmv hjnm kbnbjhvhfvjgughyfdrtfgjnuictfijnihvyk jbh yg   mn hjbnn ,  hj k knb hb nk jb ");
	}
}