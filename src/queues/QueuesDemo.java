package queues;

public class QueuesDemo {
public static void main(String [] args)
{
	Queue q1 = new Queue(10);
	q1.insert(10);
	q1.insert(5);
	q1.insert(55);
	q1.display();
	q1.delete();
	q1.display();
	q1.peek();
}
}
