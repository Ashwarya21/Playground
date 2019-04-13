import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc  = new Scanner(System.in);
      int size = sc.nextInt(),i,j;
      int arr1[] = new int[size];
     for( i=0;i<size;i++)
       arr1[i]=sc.nextInt();
      int k = sc.nextInt(),temp;
      for(i=0;i<size-1;i++)
      {
        for(j=i+1;j<size;j++)
        {
          if(arr1[i]<arr1[j])
          {
            temp = arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
          }
        }
       
      }
       System.out.print(arr1[k-1]);
    }   
}