package package1;

public class Deepak 
{
  public int sum(int a,int b)
  {
	  int c;
	  c=a+b;
	  System.out.println("Result is "+c);
	  return c;
  }
  public void sum(int x,int y,int z)
  {
	  int r;
	  r=x+y+z;
	  System.out.println("Result is "+r);
  }
  public static void main(String[] args) 
  {
	Deepak ob=new Deepak();
	ob.sum(12, 2);
	ob.sum(12, 2,223);
  }
}
