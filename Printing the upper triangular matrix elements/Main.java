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
    int i,j,k;
    for(i=0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        matrix[i][j]=sc.nextInt();
      }
    }
    for(k=0;k<col_size;k++)
    {
      for(i=0,j=k;j<col_size;j++,i++)
      {
        System.out.print(matrix[i][j]+" ");
      }
    }
  }
}