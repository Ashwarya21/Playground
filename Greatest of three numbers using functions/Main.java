import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num, num1, num2;
      num = sc.nextInt();
       num1 = sc.nextInt();
       num2 = sc.nextInt();
      System.out.println(greatest_num(num, num1, num2));
	}
  public static int greatest_num(int num, int num1, int num2)
  {
    int greatest;
    if(num > num1)
    {
      greatest = num;
 
    }
    else
      greatest = num1;
     if(greatest > num2)
    {
      return greatest;
 
    }
    else
      return num2;
    
  }
}