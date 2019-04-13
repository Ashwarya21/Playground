import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  	
  		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n, row, col, i=1;
      n = sc.nextInt();
      for(row = 1;  row <= n; row++)
      {
        for(col = 1; col <= row; col++)
        {
          if(i %2 ==1)
              System.out.print("*");
          else
            System.out.print("#");
            i++;
            
        }
        System.out.print("\n");
      }
    }
}