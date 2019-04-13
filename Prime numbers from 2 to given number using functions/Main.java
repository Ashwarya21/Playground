import java.util.Scanner;
class Main{
  public static int check_prime(int num)
  {
    int i, k=0;
    for(i=2; i<= num/2; i++)
    {
      if(num%i==0)
      {
        k=1;
        break;
      }
    }
    return k;
  }
	public static void main (String[] args){
	    // Typeyour code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, k;
      for(i=2; i<=num; i++)
      {
        k = check_prime(i);
        if(k==0)
          System.out.println(i);
        else
          continue;
      }
	}
}