package package1;

public class ClassB extends ClassA
{
	public void arithmetic(int x,int y)
	{
		super.arithmetic(12, 22);
		int result;
		result=x-y;
		System.out.println("result is "+result);
	}
	public static void main(String[] args) {
	
		ClassB obj=new ClassB();
		obj.arithmetic(12, 2);
		
	}

}
