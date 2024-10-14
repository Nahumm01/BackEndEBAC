package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<String>();
		ad.add("Red");
		ad.add("Blue");
		ad.add("Green");
		ad.add("Yellow");
		ad.add("Orange");

		Deque<String> d = new ArrayDeque<String>();
		d.add("Red");
		d.add("Blue");

		ad.addAll(d);

		System.out.println(ad);
		System.out.println(ad.contains("Red"));
		System.out.println(ad.containsAll(d));
		System.out.println("Getting first element: " + ad.getFirst());
		System.out.println("Getting last element: " + ad.getLast());
		System.out.println("Output of peek" + ad.peek());
		System.out.println("Getting first element with peekFirst " + ad.peekFirst());
		System.out.println("Getting last element with peekLast " + ad.peekLast());




	}

}
