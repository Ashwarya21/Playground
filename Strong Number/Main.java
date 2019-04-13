import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num, prod=1, digits=0, rem, i, num1, num2,sum=0;
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
        rem = num1%10;
        for(i=1;i<=rem;i++)
        {
          prod = prod*i;
        }
        sum = sum+prod;
        prod = 1;
        num1/=10;
      }
      if(sum == num2)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}