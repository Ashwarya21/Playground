import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1=sc.nextLine();
    int N = str.length(), M=str1.length();
    int res=0;
     for (int i = 0; i <= N - M; i++) { 
            
            int j;             
            for (j = 0; j < M; j++) { 
                if (str.charAt(i + j) != str1.charAt(j)) { 
                    break; 
                } 
            } 
 
            if (j == M) {                 
                res++;                 
                j = 0;                 
            }             
        }
    System.out.print(res);
  } 
}