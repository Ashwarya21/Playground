import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
    int num1,nu=num,count=0;
    if(num<0)
      num1=0-(num);
    else
      num1=num;
    while(num!=0)
    {
      count++;
      num/=10;
    }
    
      char str[]= new char[count],ch;
    int j=count-1,rem;
    while(num1!=0)
    {
      rem = num1%10;
      ch = (char)('0'+rem);
      str[j]=ch;
      j--;
      num1/=10;
    }
    if(nu<0){
      System.out.print("-");
      System.out.print(str);
    }
    else
       System.out.print(str);
    
   
  }
}