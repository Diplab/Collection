import java.util.LinkedList;
import java.util.Queue;

public class CountDown {

	public static void main(String[] args) throws InterruptedException {
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 10; i >= 0; i--)
			queue.add(i);

		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			Thread.sleep(100);
		}
		
		for(int i = 10; i >= 0; i--)
			queue.offer(i);
		
		Integer i ;
		while (  (i = queue.poll()) != null ) {
			System.out.println(i);
			Thread.sleep(100);
		}
	}

}
