import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) 
    {
      int number;
      
     Scanner ob=new Scanner(System.in);
     System.out.print("enter the number\n");
     number=ob.nextInt();
     Name(number);
    }
    
  public static  void Name(int number)
    {
      String name="Shyam";
      while(number!=0)
      {
        System.out.println(name);
        Name(number-1);
      }
    }
     
}
