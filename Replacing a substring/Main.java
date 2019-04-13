import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String st1=new String("");
      String str2 = sc.nextLine();
      String str3=sc.nextLine();
      if(str.contains(str2)==true)
      {
      st1 =  str.replace(str2,str3);
      }
      System.out.print(st1);
    }
}