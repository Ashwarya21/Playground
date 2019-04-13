import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
           Scanner sc = new Scanner(System.in);
      int n, i, j;
      n = sc.nextInt();
      for(i = 1; i<=n; i++)
      {
        for(j = 1; j<=n; j++){
        if(i==1 || i==n)
        {
          
             System.out.print("*");
        }
              else
              {
                if(j==1 || j==n)
                   System.out.print("*");
                else
                   System.out.print(" ");
              }
        } 
        System.out.print("\n");
      }
	}
}