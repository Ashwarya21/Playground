import java.util.Scanner;
class Main
{
  public static int Summation(int list[], int n,int low,int high)
  {
  int  sum = 0;
    for(int i=low;i<=high;i++)
    {
      sum = sum+list[i];
    }
    return sum;
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int arr[] = new int[n];
    int k, i , l = 0, low=0, high=2;
    for(i = 0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    k = n/3;
    int sum[] = new int[k];
    for(i=0;i<k;i++)
    {
      sum[i] =  Summation(arr,n,low,high);
      high+=3;
      low+=3;
    }
    for(i=1;i<k;i++)
    {
      if(sum[0]==sum[i])
      {
        l=1;
      }
      else
      {    l =0; 
       break;}
    }
    if(l==1)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}