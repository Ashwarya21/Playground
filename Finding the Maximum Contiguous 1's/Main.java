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
      int count=0, i =0;
      for(i = 0; i<arr_size;i++)
      {
        arr[i] = sc.nextInt();
      }
      for(i=0;i<arr_size;i++)
        ount[i]=0;
      int k = 0;
      i=0;
      while(i!=arr_size)
      {
        if(arr[i]==1)
        {
            count++;
            i++;
        }
        else{
            ount[k]=count;
            k++;
            i++;
          count=0;
        }
        
      }
      int max = ount[0];
      for(i=1;i<k;i++)
      {
        if(max<ount[i])
        {
          max=ount[i];
        }
      }
      System.out.print(max);
    }
}