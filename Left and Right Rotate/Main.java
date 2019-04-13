import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int arr1[] = new int[n];
    int arr2[] = new int[n];
    int s1=0,s2=0,i,j=0,k=0;
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int rot =sc.nextInt();
    for(i=0;i<n;i+=2)
    {
      arr1[s1]=arr[i];
      s1++;
    }
    for(i=1;i<n;i+=2)
    {
      arr2[s2]=arr[i];
      s2++;
    }
    
    Right_Rotate(arr1,n,s1,rot);
    Left_Rotate(arr2,n,s2,rot);
    for(i=0;i<n;i++)
    {
      if(i%2==0)
      {
        arr[i]=arr1[j];
        j++;
      }
      else
      {
        arr[i]=arr2[k];
        k++;
      }
    }
    for(i=0;i<n;i++)
      System.out.print(arr[i]+" ");
    }
  public static void Right_Rotate(int arr1[],int n, int s1,int rot)
  {
    int temp,i,j;
    for(i=0;i<rot;i++)
    {
      temp = arr1[s1-1];
      for(j=s1-2;j>=0;j--)
      {
        arr1[j+1]=arr1[j];
      }
      arr1[0]=temp;
    }
  }
     public static void Left_Rotate(int arr2[],int n, int s2,int rot)
  {
    int temp,i,j;
    for(i=0;i<rot;i++)
    {
      temp = arr2[0];
      for(j=1;j<s2;j++)
      {
        arr2[j-1]=arr2[j];
      }
      arr2[s2-1]=temp;
    }
    
  }
}