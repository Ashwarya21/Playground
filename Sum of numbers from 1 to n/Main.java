import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n, i, sum=0;
      n = sc.nextInt();
      for(i=1; i<=n; i++)
      	sum+=i;
      System.out.println(sum);
	}
}