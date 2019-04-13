import java.util.*;
class Main{
  public static int power(int num, int exp)
  {
    int i, prod=1;
    for(i=1; i<=exp; i++)
    {   prod = prod * num; }
    return prod;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int exp = sc.nextInt();
    int res;
     res = power(num,exp);
    System.out.println(res);
  }
}