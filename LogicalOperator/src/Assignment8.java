import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1, ch2;

        System.out.print("Have you completed you masters(Y/N): ");
        ch1 = input.next().charAt(0);
        System.out.print("Are you fulent in English?(Y/N): ");
        ch2 = input.next().charAt(0);

        if (ch1=='Y' && ch2 == 'Y') {
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
