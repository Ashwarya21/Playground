import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int col_size = sc.nextInt();
    int matrix1[][] = new int[row_size][col_size];
    for(int i = 0 ; i<row_size; i ++)
    {
      for(int j = 0; j<col_size;j++ )
      {
        matrix1[i][j]=sc.nextInt();
      }
    }
    int matrix2[][]=new int[row_size][col_size];
       for(int i = 0 ; i<row_size; i ++)
    {
      for(int j = 0; j<col_size;j++ )
      {
        matrix2[i][j]=sc.nextInt();
      }
    }
    int result[][] = new int[row_size][col_size];
      for(int i = 0 ; i<row_size; i ++)
    {
      for(int j = 0; j<col_size;j++ )
      {
        result[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
      for(int i = 0 ; i<row_size; i ++)
    {
      for(int j = 0; j<col_size;j++ )
      {
        System.out.print(result[i][j]+" ");
      }
        System.out.println();
    }
  }
}