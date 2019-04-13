import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int col_size = sc.nextInt();
    int matrix[][] = new int[row_size][col_size];
    int i,j;
    for(i = 0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        matrix[i][j]=sc.nextInt();
      }
    }
    int transpose[][]=new int[col_size][row_size];
    for(i = 0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        transpose[j][i]=matrix[i][j];
      }
    }
  
 // int transpose[][] = new int[col_size][row_size];
 
     for(i = 0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        System.out.print(transpose[i][j]+" ");
      }
       System.out.println();
    }
  }
}