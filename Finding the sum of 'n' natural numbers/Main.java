import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int k = fact(num);
    System.out.print(k);
  }
  public static int fact(int num)
  {
    if(num==0)
      return 0;
    else
      return num+fact(num-1);
  }
}