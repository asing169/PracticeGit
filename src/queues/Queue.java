package queues;

public class Queue {
	private int arrayQ [];
	private int front;
	private int rear;
	private int numOfEl;
	private int maxSize;
	
	public Queue(int size)
	{
		maxSize = size;
		arrayQ = new int [maxSize];
		front = 0;
		rear = -1;
		numOfEl = 0;
		
	}
	
	public void insert(int num)
	{
		arrayQ[++rear] = num;
		if (rear == maxSize -1)
			rear = -1;
		numOfEl ++;

	}
	
	public void delete()
	{
		
		front++;
		if(front == maxSize - 1)
			front = 0;
		
		numOfEl --;
	}
	
	public void peek()
	{
		System.out.println(arrayQ[front]);
	}
	
	public void display()
	{
		for(int i= front; i <= rear; i++)
		{
			System.out.println(arrayQ[i]);
		}
	}

}
