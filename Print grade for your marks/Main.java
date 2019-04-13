import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int marks=sc.nextInt();
      if(marks>=0 && marks<=100)
      {
      if(marks>=85)
      System.out.println("A");
          else  if(marks>=75 && marks<85)
      System.out.println("B");
        else   if(marks>=65 && marks<75)
      System.out.println("C");
         else   if(marks>=55 && marks<65)
      System.out.println("D");
         else   if(marks>=45 && marks<55)
      System.out.println("E");
         else   
      System.out.println("Fail");
               

      } 
    }
}