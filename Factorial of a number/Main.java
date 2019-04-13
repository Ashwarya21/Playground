import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc =  new Scanner(System.in);
      int num, i, prod=1;
      num = sc.nextInt();
      for(i=1;i<=num;i++)
        prod = prod*i;
      System.out.println(prod);
	}
}