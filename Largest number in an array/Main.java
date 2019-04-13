import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int i;
      int arr[] = new int[arr_size];
      for( i = 0; i < arr_size; i++)
        arr[i] = sc.nextInt();
      int max = arr[0];
      for(i = 1 ;i < arr_size; i++)
      {
        if(arr[i] > max)
        {
          max = arr[i];
        }
        else
          continue;
      }
      System.out.print(max);
    }
}