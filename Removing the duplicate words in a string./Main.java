import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count = 1;
     int i, len = str.length();
     for(i=0; i<len; i++)
     {
       if(str.charAt(i) == ' ')
       {
         count++;
       }
     }
       String arr[] = str.split(" ",count);
     String s = "0";
       for(int index = 0; index <= arr.length - 2; index++)
       {
           for(i = index+1; i<=arr.length-1 ; i++)
           {
             if(arr[index].equals(arr[i]))
             {
               arr[i] = s;
               break;
             }
             else
               continue;
           }
       }
     for(i=0;i<arr.length;i++)
     {
       if(arr[i]!=s)
       {
         String res = arr[i];
         System.out.print(res);
         System.out.print(" ");
       }
     }
   }
}