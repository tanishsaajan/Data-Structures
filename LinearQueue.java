import java.util.*;
class Queue
{
int front=-1,rear=-1;
int que[]=new int[4];
void Enqueue(int n)
{
    if(rear==4)
    {
        System.out.println("Queue is full");
    }
    else
    {
        front=0;
        rear++;
        que[rear]=n;
    }
}
void Dequeue()
{
    if(rear==-1&&front==-1)
    {
      front=rear=-1;
    }
    else{
        System.out.println("");
       System.out.println(que[front]+" Elemented deleted ");
       front++;
    }
}
void display()
{
    int i=0;
    
    if(rear==front)
    {
        
        System.out.println("Queue is empty");
    }
    else{
    for( i=front;i<=rear;i++)
    {
        System.out.print(que[i]+" ");
    }
    }
}
   

}
class Main
{
	public static void main(String[] args) {
	    Queue q=new Queue();
	    q.display();
	    q.Enqueue(1);
	    	    q.Enqueue(2);
	    	    	    q.Enqueue(3);
	    	    	    	    q.Enqueue(4);
	    	    	    	    q.display();
	    	    	    	    q.Dequeue();
	    	    	    	    q.Dequeue();
	    	    	    	    q.display();
}
}
