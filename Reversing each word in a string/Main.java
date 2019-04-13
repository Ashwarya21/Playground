import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int leng = str.length();
    int i, start = 0, idx,j=0;
    for(i=0;i<leng;i++)
    {
      if(sb.charAt(i)==' ')
      {
        j=i;
        reverse(sb,start,j-1);
        start = i+1;
      }
      else if(i==leng-1)
      {
        reverse(sb,start,leng-1);
      }
    
    }
      System.out.print(sb);
  }
    public static void reverse(StringBuilder sb,int i,int j)
    {
   
      
      char temp;
      while(i<j)
      {
        temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
                     sb.setCharAt(j,temp);
                     i++;j--;
      }
    }
    
    
  }
