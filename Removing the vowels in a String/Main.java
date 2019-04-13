import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb1 = new StringBuilder("");
    int len = sb.length(),i;
    for(i=0;i<len;i++)
    {
      if(sb.charAt(i)!='A' && sb.charAt(i)!='E' && sb.charAt(i)!='I' && sb.charAt(i)!='O' && sb.charAt(i)!='U' && sb.charAt(i)!='a' && sb.charAt(i)!='e' && sb.charAt(i)!='i' && sb.charAt(i)!='o' && sb.charAt(i)!='u' )
      {
        sb1.append(sb.charAt(i));
      }
      else
        continue;
         
    }
    System.out.print(sb1);
  }
}