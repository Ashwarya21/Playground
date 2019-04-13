import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int arr_size = sc.nextInt();
    int arr[] = new int[arr_size];
    int i,j;
    for(i=0;i<arr_size;i++)
      arr[i]=sc.nextInt();
    for(i=0;i<arr_size-1;i++)
    {
      for(j=i+1;j<arr_size;j++)
      {
        if(arr[i]<arr[j]&&arr[j]>arr[j-1])
        {
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
  }
}