import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int i, len = sb.length(),c=0;
      char ch;
      StringBuilder temp = new StringBuilder("");
      for(i=len-1;i>=0;i--)
      {
        ch = sb.charAt(i);
        temp.append(ch);
      }
      for(i=0;i<=len-1;i++)
      {
        c=0;
        if(sb.charAt(i)==temp.charAt(i))
        {
          c++;
        }
        else
        {
          c=0;
          break;
        }
      }
      
      if(c>0)
        System.out.print("Yes");
      else
        System.out.print("No");
      
    }
}