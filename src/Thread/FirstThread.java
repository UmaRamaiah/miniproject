
package Thread;
public class FirstThread extends Thread
{
	Table t;
	public FirstThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.prnitTable(5);
		
	}

}

 class SecondThread extends Thread
{
	Table t;
	public SecondThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.prnitTable(2);
		

}
}