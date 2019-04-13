import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str2 = sc.nextLine();
      int len2 = str2.length(); 
      String st =  str+str;
      int len1 = st.length(),i,j;
      boolean is_sub = true;
      StringBuilder sb = new StringBuilder(st);
      for(i=0;i<=len1-len2;i++)
      {
        is_sub=true;
        for(j=0;j<len2;j++)
        {
          if(sb.charAt(i+j)!=str2.charAt(j))
          {
            is_sub=false;
          }
        }
        if(is_sub==true)
        {
       //   System.out.print("Yes");
          break;
        }

      }
      if(is_sub==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}