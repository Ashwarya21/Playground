import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length();
      delete_spaces(sb,len);
    int new_len = sb.length();
    int col_count = sc.nextInt();
    char ch = 'X';
    int row_count = new_len/col_count+1;
   char  mat[][] = new char[row_count][col_count];
    int i,j,c=0;
    for(i=0;i<row_count;i++)
    {
      
        if(i%2==0)
        {
          for(j=0;j<col_count;j++)
          {
              if(c==new_len)
              {
                mat[i][j]=ch;
              }
            else
            {
                mat[i][j]=sb.charAt(c);
            c++;
            }
          }
          
        }
        else
        {
          for(j=col_count-1;j>=0;j--)
          {
          
              if(c==new_len)
              {
                mat[i][j]=ch;
              }
            else
            {
                mat[i][j]=sb.charAt(c);
            c++;
            }
          }
        
            
        }
      
    }
 for(i=0;i<=col_count-1;i++)
     {
       for(j=0;j<=row_count-1;j++)
           {
             System.out.print(mat[j][i]);
           }
     }
    
  }
  public static void delete_spaces(StringBuilder sb, int len)
  {
    StringBuilder temp = new StringBuilder("");
    int i;
    for(i=0;i<len;i++)
    {
      if(sb.charAt(i)!=' ')
      {
        temp.append(sb.charAt(i));
      }
    }
    sb.setLength(0);
    int k = temp.length();
    for(i=0;i<k;i++)
    {
      sb.append(temp.charAt(i));
    }
  }
}