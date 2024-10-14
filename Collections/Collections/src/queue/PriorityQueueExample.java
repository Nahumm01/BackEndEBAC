package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Short");
		queue.add("Long");
		queue.add("Medium");
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}

	}
}
