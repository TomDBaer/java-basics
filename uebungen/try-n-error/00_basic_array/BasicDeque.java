import java.util.ArrayDeque;
import java.util.LinkedList;

public class BasicDeque {
    public static void main(String[] args) {

        // FILO Das erste geht rein und das letzte geht raus
        var stack = new ArrayDeque<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.printf("Der stack ist jetzt nur noch %d gross%n", stack.size());
        System.out.println(stack);

        // FIFO Das erst geht rein und das erste geht raus
        var queue = new LinkedList<String>();

        queue.offer("Eins");
        queue.offer("Zwei");
        queue.offer("Drei");
        queue.poll();
        System.out.println(queue);
        queue.removeLast();
        System.out.println(queue);
    }
}
