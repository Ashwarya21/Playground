import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0; i < arr_size; i++)
        arr[i] = sc.nextInt();
      int num1 = sc.nextInt(), num2 = sc.nextInt();
      int k = 0, j=0,i, ind1=0,ind2=0;
      for(i = 0 ;i < arr_size ; i++)
      {
        if(arr[i] == num1)
        {
          k=1;
          ind1 = i;
          break;
        }
      }
       for(i = 0 ;i < arr_size ; i++)
      {
        if(arr[i] == num2)
        {
          j=1;
           ind2=i;
          break;
        }
      }
      if(k!=0 && j!=0)
      {
        System.out.println(ind1);
        System.out.println(ind2);
      }
     else   if(k!=0 && j==0)
      {
        System.out.println(ind1);
       ind2= -1;
        System.out.println(ind2);
      }
    else    if(k==0 && j!=0)
      {
      ind1 = -1;
        System.out.println(ind1);
        System.out.println(ind2);
      }
        else
      {
          ind1=-1;
          ind2=-1;
        System.out.println(ind1);
        System.out.println(ind2);
      }
      
      
    }
}