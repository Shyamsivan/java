public class Average {
    public static void main(String args[]) {
     double[] array={60,78,45,67,98,57,89,65,75,95};
     double avg,sum=0;
     for(int i=0;i<10;i++)
     {sum+=array[i];}
     
     avg=sum/10;
     
     System.out.println("Average of the array elements="+" "+avg);
      
    }
}