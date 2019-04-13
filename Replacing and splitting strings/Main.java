import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      int limit = sc.nextInt();
      String[] data = str2.split(" ",limit);
      int i;
      for(i=0;i<limit;i++)
        System.out.println(data[i]);
    }
}