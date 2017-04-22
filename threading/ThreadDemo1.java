package threading;
//Methods of Thread class
class MyThread extends Thread
{
    public void run()
    {
    	System.out.println("I am a thread");
    }
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//creates a thread and invokes run()
	}

}
