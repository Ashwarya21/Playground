import java.util.Scanner;
class Main{
  public static int Sum(int num)
  {
    int i, sum = 0;
    for(i = 1; i <= num; i++)
    {
      sum = sum + i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.print(Sum(num));
	}
}