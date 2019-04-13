import java.util.*;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt(), i , front, end;
      int arr[] = new int[arr_size];
      for(i=0;i<arr_size;i++)
      {
        arr[i] = sc.nextInt();
      }
      int c = 0;
      front = 0; end=arr_size-1;
      while(front<end)
      {
        if(arr[front]==arr[end])
        {
          front++;
          end--;
          c++;
        }
        else
        {
          c = 0;
          break;
        }
      }
      if(c!=0)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}