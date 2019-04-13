import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n, i, j, k=0;
     	n = sc.nextInt();
      for(i = 1; i <=n ; i ++)
      {
        if(i%2==1)
        {
          k=k+1;
          for(j = 1; j <=n ;  j++)
          {
            if(j!=n)
              System.out.print(k);
            else
            {
              k=k+1;
              System.out.print(k++);
            }
          }
        }
        else
        {
          for(j = 1; j <=n ;  j++)
          {
            if(j==1)
            {   System.out.print(k); k--;}
            else
            {
               System.out.print(k);
            }
          }
        }
        System.out.print("\n");
      }
	}
}