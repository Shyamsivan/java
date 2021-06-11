public class Change_case
{
    public static void main(String[] args)
{
    String var1="ALL IS WELL";
    case_change(var1);
    
    System.out.println("The original string is"+" "+var1);
}

public static void case_change(String var2)
{
    var2.toLowerCase();
    
    System.out.println("The string after case change is"+" "+var2); 
    
}
}