import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] words = new String[size];
        for(int i = 0; i < size; i++)
        {
            words[i] = sc.next();
        }
        int k = 0;
        
        for(int i = 0; i < size  - 1; ++i) 
        {
            for (int j = i + 1; j < size; ++j) 
            {
                if (words[i].charAt(k)>words[j].charAt(k)) 
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                    k = 0;
                }
            }
        }
        for(int i = 0; i < size; i++) 
        {
          String result = words[i].toLowerCase();
            System.out.println(result);
        }
    }
}