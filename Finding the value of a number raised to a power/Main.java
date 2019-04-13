import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt() , exponent = sc.nextInt(), i=1, result=1;
      while(i<=exponent)
      {
        result = result*base;
        i++;
      }
      System.out.println(result);
    }
}