package Multithreading;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class PCFactory {
		int maxsize = 6;
		Queue<Integer> queue = new ArrayDeque<>(maxsize);
		
		public static void pleasewait() {
		for(int i=0;i<3;i++) {
			try {
			Thread.sleep(1500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		System.out.print(".");
		}
		}
		
		public synchronized void produce() {
			System.out.println("-----------------------------Producing Items Log--------------------------------------");
			for(int i=1;i<=6;i++) {
				if(queue.size()!=maxsize) {
					queue.add(i);
					System.out.print("Producing item no :"+i);
					pleasewait();
					System.out.println();
				}
				else {
					try {
						this.wait(200);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					this.notify();
				}
			}
		}
		public synchronized void consume() {
			System.out.println();
			System.out.println("-----------------------Consuming Items Log--------------------------------------");
			for(int i=1;i<=10;i++) {
				if(!queue.isEmpty()) {
					try {
					System.out.print("Consuming item no :"+queue.remove());
					pleasewait();
					System.out.println();
					}
					catch(NoSuchElementException e) {
						e.printStackTrace();
					}
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