import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),i,j;
    int arr[] = new int[n];
    int temp;
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(i=0;i<n/2;i++)
    {
      for(j=i+1;j<n/2;j++)
      {
        if(arr[i]>arr[j])
        {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(i=n/2;i<n-1;i++)
    {
     for(j=i+1;j<n;j++)
     {
       if(arr[i]<arr[j])
       {
         temp = arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
       }
         
     }
    }
      for(i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    } 
  }
}