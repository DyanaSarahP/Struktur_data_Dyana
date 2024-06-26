package String;
import java.util.Stack;
import java.util.Scanner;

public class DeteksiPalindrom {
    public static void main(String[] args) {
        System.out.print("Inputan Kata adalah : ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Stack stack = new Stack();
        
        for (int i=0; i<inputString.length(); i++)
        {
            stack.push(inputString.charAt(i));
        }
        String reverseString = "";
        
        while(!stack.isEmpty())
        {
            reverseString = reverseString+stack.pop();
        }
        if (inputString.equals(reverseString))
            System.out.println("Inputan tersebut adalah Palindrom");
        else
            System.out.println("Inputan tersebut bukan Palindrom");
    }
    
}
