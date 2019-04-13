import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int num,rev=0,rem;
    num=sc.nextInt();
    while(num!=0)
    {
      rem=num%10;
      rev=rev*10+rem;
      num/=10;
    }
    System.out.println(rev);
  }
}