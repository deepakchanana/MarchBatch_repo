package package1;

public class Arithmetic
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int a1,int a2)
	{
		int r;
		r=a1-a2;
		System.out.println("Sub result is "+r);
		return r;
	}
	public void multi(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("final result is "+z);
	}
	public static void main(String[] args) 
	{
		Arithmetic ob=new Arithmetic();
		// classname reference_varialbe=new classname():
		// Dipesh ab=new Dipesh();
		
		int sumresult=ob.sum(10,2);
		int subresult=ob.sub(10,2);
		ob.multi(sumresult, subresult);
	}

}
