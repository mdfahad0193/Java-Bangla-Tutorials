import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any Latter: ");
        
        ch=input.next().charAt(0);

        if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("vowel");
        }
        else{
            System.out.println("Consonat");
        }

    }
}
