import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int num1, num2, num3, g=0;
      Scanner sc =new Scanner(System.in);
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      num3 = sc.nextInt();
      if(num1 > num2 && num1> num3)
        g = num1;
       if(num3 > num2 && num3> num1)
        g = num3;
       if(num2 > num3 && num2> num1)
        g = num2;
      System.out.print(g);
      
    }
}