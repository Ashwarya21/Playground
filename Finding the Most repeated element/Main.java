import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      int ount[] = new int[arr_size];
      int count=0, i =0,j,max=1,n=0,temp;
      for(i = 0; i<arr_size;i++)
      {
        arr[i] = sc.nextInt();
      }
      n=arr[0];
      for(i=0;i<arr_size;i++)
      {
        for(j=i+1;j<arr_size;j++)
        {
          if(arr[i]>=arr[j])
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
      
      for(i=0;i<arr_size;i+=count)
      {
        count=1;
        for(j=i+1;j<arr_size;j++)
        {
          if(arr[i]==arr[j])
          {
            count++;
          }
          else
          {
            break;
          }
        }
        if(max<count)
        {
          max=count;
          n = arr[i];
        }
      }
      System.out.print(n);
    }
}