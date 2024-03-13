package Multithreading;

public class OddEven {
	public synchronized void printOdd() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Odd "+i);
				this.notify();
			}
			else {
				try {
					this.wait(200);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public synchronized void printEven() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
				this.notify();
			}
			else {
				try {
					this.wait(200);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
