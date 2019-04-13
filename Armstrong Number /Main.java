import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int num, digits=0, num1, sum=0, num2, i,j, prod=1;
      num = sc.nextInt();
      num1 = num;
      num2 = num;
      while(num!=0)
      {
        digits++;
        num/=10;
      }
      while(num1!=0)
      {
        i=num1%10;
        for(j=1; j<=digits; j++)
        {
          prod=prod*i;
        }
        sum = sum+prod;
        prod = 1;
        num1/=10;
      }
      if(sum == num2)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
      
	}
}