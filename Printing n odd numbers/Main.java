import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n, i;
      n = sc.nextInt();
      int count = 1;
      for(i=1; i<=n ; i++)
      {
        System.out.println(count);
        count=count+2;
      }
	}
}