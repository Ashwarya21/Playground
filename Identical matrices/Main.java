import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int col_size = sc.nextInt();
    int matrix[][] = new int[row_size][col_size];
    int matrix2[][]=new int[row_size][col_size];
    int i,j,k;
    for(i=0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        matrix[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        matrix2[i][j]=sc.nextInt();
      }
    }
    int count=1;
    for(i=row_size-1;i>=0;i--)
    {
      for(j=0;j<col_size;j++)
      {
        if(matrix[i][j]==matrix2[i][j])
        {
          count=0;
        }
        else
        { count=1;
          break;
        }
      }
      
    }
    if(count==0)
    {
      System.out.print("Yes");
    }
    else
       System.out.print("No");
  }
}