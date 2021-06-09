package implemantationStack;

public class StackImpl {
	
	private int[] a;
	private int index;
	private int size;
	
	{
		index=-1;
	}
	
	public void createStack(int size) {
		this.size=size;
		a=new int[this.size];
		System.out.println("stack created successfully");
		
	}
	 
	public void push(int item) {
		if(index>=size) {
			System.out.println("stack overflow");
		}
		else {
			a[++index]=item;
			System.out.println("Pushed successfully...."+item);
		}
	}
	
	public void pop() {
		if(index==-1) {
			System.out.println("stack underflow");
		}
		else
		{
			System.out.println("Poped successfully...."+a[index--]);
		}
	}

}
