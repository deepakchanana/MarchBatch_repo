package package1;

public class Automation
{
   int deepak; 
   public void display()
   {
	System.out.println("Welcome to all of you ");   
   }
   public static void main(String[] args) 
   {
	 Automation ob=new Automation();
	 ob.display();
	 ob.deepak=123;
	 System.out.println(ob.deepak);
	 ob.deepak=1;
	 System.out.println(ob.deepak);
   }
	
}
