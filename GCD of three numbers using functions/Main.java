import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
	  Scanner sc = new Scanner(System.in);
      int num, num1, num2;
      num = sc.nextInt();
       num1 = sc.nextInt();
       num2 = sc.nextInt();
      int k = greatest_num(num, num1);
      System.out.println(greatest_num(k, num2));
	}
  public static int greatest_num(int num, int num1)
  {
    int gcd=0, min;
    if( num > num1)
      min = num1;
    else
      min = num;
    while(min >= 1)
    {
      if((num%min == 0)&&(num1%min == 0))
      {
        gcd = min;
        break;
      }
      min--;
    }
    return gcd;
  }
}