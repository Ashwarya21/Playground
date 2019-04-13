import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num, rem, sum=0;
      num = sc.nextInt();
      while(num!=0)
      {
        rem = num%10;
        sum = sum+rem;
        num/=10;
      }
      System.out.println(sum);
	}
}