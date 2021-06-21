import java.util.Scanner;  
public class Main
{
	public static void main(String[] args) {
	    
	    int len1,len2;
		
Scanner ob= new Scanner(System.in);  
System.out.print("Please enter the number of strings you want to enter: ");   
        
String[] dna = new String[ob.nextInt()];      
  
ob.nextLine();   
for (int i = 0; i < dna.length; i++)   
{  System.out.println("Entert the"+" "+(1+i)+" "+"string");
dna[i] = ob.nextLine();  
}  

len1=dna[0].length();
len2=dna[1].length();

if((dna[0].equals(dna[1]))==true)
{System.out.println("Both the strings are equal");}

System.out.println("\n1st string length="+len1+"\n"+"2nd string length="+len2+"\n");

}  
} 