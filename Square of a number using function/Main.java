import java.util.Scanner;
class Main
{
  public static int root(int num)
  {
    return num*num;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(root(num));
	} 
}