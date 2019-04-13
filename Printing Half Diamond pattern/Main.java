import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n, i, j;
      n = sc.nextInt();
      for(i  = 1; i <= n; i++)
      {
        for(j = 1; j <= n-i; j++)
        {
          System.out.print(" ");
        }
        for(j = 1; j <= 2 * i - 1; j++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}