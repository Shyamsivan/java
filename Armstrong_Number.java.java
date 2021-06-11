import java.util.*;
public class Armstrong
{ 
  public static void main(String[] args)
   {
     int arm,rem,sum=0,num;
     Scanner ob=new Scanner(System.in);
     System.out.print("enter the number\n");
     arm=ob.nextInt();
     num=arm;
     
     while(num!=0)
     {
         rem=num%10;
         sum+=(rem*rem*rem);
         num=num/10;
     }
     
     if(sum==arm)
     {
         System.out.println("The number entered by the user is an Armstrong number");
     }
     
     else
     System.out.println("The number entered by the user is not an Armstrong number");
     
     
     }
     
}