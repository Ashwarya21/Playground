import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int num=0, len=str.length(),i=0,rem,j,c=0,prod=1;
    while(i<=len-1)
    {
      
      if(str.charAt(i)=='.')
        break;
      i++;
    }
    for(j=i+1;j<=len-1;j++)
    {
      c++;
    }
    for(i=1;i<=c;i++)
    {
      prod = prod*10;
    }
    i=0;
    for(i=0;i<len;i++)
    {
      if(str.charAt(i)!='.')
      {
        rem = str.charAt(i)-'0';
          num = num*10+rem;
      }
    }
    double m = (double)num/prod;
    System.out.print(m);
  }
}