import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int j;
      int i;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int val = sc.nextInt();
      int sum;
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          sum = 0;
          sum = sum +arr[i]+arr[j];
          if(sum==val)
          {
            System.out.println(arr[i]+", "+arr[j]);
          }
        }
      }
    }
}