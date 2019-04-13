import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt(), column = sc.nextInt(),i,j, m;
      for(i=row;i>=1;i--)
      {
        j=column;
        m=row;
        while(j>=1)
        {
          if(i<j){
            System.out.print(m);
            m--;
          }
          else if(i>=j)
            System.out.print(i);
          j--;
        }
        System.out.println();
      }
    }
}