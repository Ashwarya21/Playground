import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int key,offset;
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length(), i,j;
    char ch='a';
    key = sc.nextInt();
    for(i=0;i<len;i++)
    {
      if(sb.charAt(i)!=' ')
      {
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          offset=('Z' - sb.charAt(i));
          offset = (offset+key)%26;
          ch = (char)('Z' - offset);
           sb.setCharAt(i,ch);
        }
          if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
        {
          offset=('z' - sb.charAt(i));
          offset = (offset+key)%26;
          ch = (char)('z' - offset);
             sb.setCharAt(i,ch);
        }
      }
     
    }
    System.out.print(sb);
  }
}