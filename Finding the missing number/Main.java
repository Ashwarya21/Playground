import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt(),i;
      int arr1[] = new int[arr_size];
      int arr2[] = new int[arr_size];
      for(i = 0; i<arr_size;i++)
      {
        arr1[i]=sc.nextInt();
      }
      for(i = 0; i<arr_size;i++)
      {
        arr2[i]=0;
      }
      int num;
      for(i=0;i<arr_size;i++)
      {
        num = arr1[i];
        arr2[num-1]++;
        
      }
      for(i=0;i<arr_size;i++)
      {
        if(arr2[i]==0)
          System.out.print(i+1);
      }
    }
}