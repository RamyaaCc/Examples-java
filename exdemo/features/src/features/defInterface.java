package features;


//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface Add
{
 // default method
 default void show()
 {
	 
	 int a=10,b=10;
     System.out.println(a+b);
     System.out.println("Numbers were Added");
 }
}

interface Sub
{
 // Default method
 default void show()
 {
	 int a=10,b=5;
     System.out.println(a-b);
     System.out.println("Numbers were subtracted");
 }
}

//Implementation class code
public class defInterface implements Add, Sub
{
 // Overriding default show method
 public void show()
 {
     // use super keyword to call the show
     // method of TestInterface1 interface
     Add.super.show();

     // use super keyword to call the show
     // method of TestInterface2 interface
     Sub.super.show();
 }

 public static void main(String args[])
 {
	 defInterface d = new defInterface();
     d.show();
 }
}
