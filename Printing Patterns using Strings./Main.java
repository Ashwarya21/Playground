import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int len = str.length(), i,j;
    int n = len/2,k;
    for(i = 0; i<len;i++)
    {
       n=len/2;
      for(j=i;j<len-1;j++)
      {
        System.out.print(" ");
      }
      for(k=0;k<=i;k++)
      {
       
        if(n<=len-1)
        {
          System.out.print(str.charAt(n));
                           n++;
          					
                           if(n==len)
                           {
                            n=0; 
                           }
         
        }
      }
                System.out.print("\n");
    }
    
  }
}