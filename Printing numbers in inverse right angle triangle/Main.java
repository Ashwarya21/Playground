import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
            Scanner sc = new Scanner(System.in);
      int n, i, j, k;
      n = sc.nextInt();
      for(i  = 1; i <= n; i++)
      {
        k = n - i + 1;
        for(j = 1; j <= n + 1 - i; j++)
        {
          System.out.print(k--);
        }
        System.out.print("\n");
      }
	}
}