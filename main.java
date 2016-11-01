import java.util.Scanner;

public class main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to reverse it");
        String input = sc.nextLine();
        String output = "";
        
        for (int i = 0; i < input.length(); i++)
        {
            output += input.charAt((input.length() - i) - 1);
        }
        
        System.out.println(output);
    }
}
