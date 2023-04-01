package package1;

public class Student 
{            // {} boundary of the class
	int a; // it is a variable it will store integer value
	public void deepak()
	{   // boundary of the method
		System.out.println("welcome to all of you ");
	}
	public static void main(String[] args) 
	{
		Student abc=new Student(); 
		abc.deepak();  // called the method
		abc.a=122;  // called the variable and given the value
		System.out.println(abc.a);
	}

}
