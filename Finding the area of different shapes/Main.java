import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();
      int area;
      switch(choice)
      {
        case 1 :
          int side = sc.nextInt();
          area = side*side;
          System.out.println(area);
          break;
        case 2:
          int length = sc.nextInt();
          int breath = sc.nextInt();
            area = length*breath;
          System.out.println(area);
          break;
        case 3:
          int base = sc.nextInt();
          int height = sc.nextInt();
            area = (height*base)/2;
          System.out.println(area);
          break;
        case 4:
          double radius=sc.nextDouble();
          double a = 3.14 * radius * radius;
          System.out.println(a);
          break;
        default:
          break;
      }
    }
}