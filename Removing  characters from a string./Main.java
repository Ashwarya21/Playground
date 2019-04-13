import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    String str2 = sc.nextLine();
    int len1=str.length(), len2=str2.length(),i,j;
    char ch = '@';
    for(i=0;i<len1;i++)
    {
      for(j=0;j<len2;j++)
      {
        if(sb.charAt(i) ==str2.charAt(j) && sb.charAt(i)!=' ')
        {
          sb.setCharAt(i,ch);
          break;
        }
      }
    }
    for(i=0;i<len1;i++)
    {
      if(sb.charAt(i)!=ch)
      {
        System.out.print(sb.charAt(i));
      }
    }
  }
}