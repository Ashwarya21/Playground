import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int i, max,pos;
    for(i=0; i<n; i++)
      arr[i]=sc.nextInt();
    max = arr[0];
    pos = 0;
    for(i=1;i<n;i++)
    {
      if(arr[i]>max)
      {
        max = arr[i];
        pos=i;
      }
    }
    System.out.print(pos);
  }
}