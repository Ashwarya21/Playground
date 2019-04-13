import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc =new Scanner(System.in);
      int num,first,last,nod=0,rem,prod=1,sum,i;
      num = sc.nextInt();
      int num1=num;
      while(num!=0)
      {
        rem=num%10;
        nod++;
        num/=10;
      }
      last = num1%10;
      for(i=1;i<=nod-1;i++)
      		prod=prod*10;
      first = num1/prod;
      sum=first+last;
      System.out.println(sum);
	}
  
}