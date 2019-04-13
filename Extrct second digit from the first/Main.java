import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num , num1,nod=0,rem,prod=1,i=1;
    num = sc.nextInt();
    num1 = num;
    while(num!=0)
    {
      rem = num%10;
      nod++;
      num/=10;
    }
    while(i<nod-1)
    {
      prod = prod*10;
      i++;
      
    }
    rem = (num1/(prod))%10;
    System.out.println(rem);
  }
}