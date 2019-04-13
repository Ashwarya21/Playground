import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();  
      int k = sc.nextInt(),i,num=0;
int arr[] = new int[n];
      int temp[] = new int[k];
      for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
        for(i=0;i<k;i++)
      {
        temp[i]=0;
      }
      for(i=0;i<n;i++)
      {
        num = arr[i];
        temp[num-1]++;
      }
      num=0;
      for(i=0;i<k;i++)
      {
        num=i+1;
        System.out.println(num+" "+temp[i]);
      }
    }
}