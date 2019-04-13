import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      int i;
      for(i=0;i<arr_size;i++)
        arr[i]=sc.nextInt();
      Group(arr,arr_size);
       for(i=0;i<arr_size;i++)
         System.out.print(arr[i]+" ");
    }
  public static void Group(int arr[], int n)
  {
    int zero_count=0,pos_count=0;
    int zero[]=new int[n];
    int pos[]=new int[n];
    int i,j;
    for(i=0;i<n;i++)
    {
      if(arr[i]==0)
      {
        zero[zero_count]=arr[i];
        zero_count++;
      }
      else
      {
        pos[pos_count]=arr[i];
        pos_count++;
      }
    }
    for(i=0;i<pos_count;i++)
    {
      arr[i]=pos[i];
    }
    for(j=0;j<zero_count;j++)
    {
      arr[i]=zero[j];
      i++;
    }
  }
}